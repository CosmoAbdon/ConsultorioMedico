/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */

import entidades.Medicos;
import java.sql.SQLException;
import DAO.GenericDAO;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class MedicosDAO extends GenericDAO
{
    
    public boolean logarMedicos(String login, String senha) throws SQLException{
    
        boolean toReturn = false;
        ResultSet rs; 
        rs = executeQuery("select * from medicos");
        
        while (rs.next()) {
        
            if (rs.getString("senha_acesso").equals(senha) && rs.getString("crm").equals(login)) {
            
                toReturn = true;
                return true;
            } else {
                toReturn = false;
            }
        }
        return toReturn;
    }
    
    public void getMedicos (int crmMedico) throws SQLException
    {
        
        
        String query = "SELECT * FROM medicos where crm = ?";
        executeQuery(query, crmMedico);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
        
        
    }
    
    public List<Medicos> getAllMedicos() throws SQLException 
    {
        List<Medicos> medicos = new LinkedList<Medicos>();
        
        ResultSet rs = executeQuery("SELECT * FROM medicos ");
                
                while(rs.next())
                {
                medicos.add(populateMedico(rs));
                }
                rs.close();
        return medicos;
    }
    
    public List<Medicos> getAllMedicosPorNome(String nome) throws SQLException 
    {
        List<Medicos> medicos = new LinkedList<Medicos>();
        
        //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
        ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?",nome+"%");
                
                while(rs.next())
                {
                medicos.add(populateMedico(rs));
                }
                rs.close();
        return medicos;
    }
    
    public List<Medicos> getAllMedicosPorCrm(String crm) throws SQLException 
    {
        List<Medicos> medicos = new LinkedList<Medicos>();
        
        //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
        ResultSet rs = executeQuery("SELECT * FROM medicos WHERE crm like ?",crm+"%");
                
                while(rs.next())
                {
                medicos.add(populateMedico(rs));
                }
                rs.close();
        return medicos;
    }
    
    public Integer addMedicos(Medicos medicos ) throws SQLException
    {
        String query = "INSERT INTO medicos(crm, nome_medico, cpf, rg, telefone, sexo, senha_acesso) VALUES (?,?,?,?,?,?,?)";
        executeComand(query, medicos.getCrm(), medicos.getNome_medico(), medicos.getCpf(), medicos.getRg(), medicos.getTelefone(), medicos.getSexo(), medicos.getSenha_acesso());
        return medicos.getId();
        
    }
    
    public void updateMedicos(Medicos medicos) throws SQLException
    {
        String query = "UPDATE medicos SET crm = ?, nome_medico = ?, cpf = ?, rg = ?, telefone = ?, sexo = ?, senha_acesso = ? WHERE id =?";
        executeComand(query, medicos.getCrm(), medicos.getNome_medico(), medicos.getCpf(), medicos.getRg(), medicos.getTelefone(), medicos.getSexo(), medicos.getSenha_acesso(), medicos.getId());        
        
    }
    
    public void deleteMedicos(Medicos medicos ) throws SQLException
    {
        String query = "DELETE FROM medicos WHERE id = ? ";
        executeComand(query, medicos.getId());
    
    }

    private Medicos populateMedico(ResultSet rs) throws SQLException {
        Medicos retorno = new Medicos();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setNome_medico(rs.getString("nome_medico"));
        retorno.setCrm(rs.getString("crm"));
        retorno.setRg(rs.getString("rg"));
        retorno.setCpf(rs.getString("cpf"));
        retorno.setTelefone(rs.getString("telefone"));
        retorno.setSexo(rs.getString("sexo"));
        
        
        return retorno;
        
    }
    
}
