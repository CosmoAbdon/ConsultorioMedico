/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */

import DAO.GenericDAO;
import java.sql.SQLException;
import entidades.Convenio;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ConvenioDAO extends GenericDAO {
    
    
    public void getMedicos (int crmMedico) throws SQLException
    {
        
        
        String query = "SELECT * FROM convenio where cnpj = ?";
        executeQuery(query, crmMedico);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
        
        
    }
    
    public List<Convenio> getAllConvenios() throws SQLException 
    {
        List<Convenio> convenio = new LinkedList<Convenio>();
        
        ResultSet rs = executeQuery("SELECT * FROM convenio ");
                
                while(rs.next())
                {
                convenio.add(populateConvenio(rs));
                }
                rs.close();
        return convenio;
    }
    
    public List<Convenio> getAllConvenioPorNome(String nome) throws SQLException 
    {
        List<Convenio> convenio = new LinkedList<Convenio>();
        
        //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
        ResultSet rs = executeQuery("SELECT * FROM convenio WHERE nome like ?",nome+"%");
                
                while(rs.next())
                {
                convenio.add(populateConvenio(rs));
                }
                rs.close();
        return convenio;
    }
    
    public List<Convenio> getAllConvenioPorCnpj(String cnpj) throws SQLException 
    {
        List<Convenio> convenio = new LinkedList<Convenio>();
        
        //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
        ResultSet rs = executeQuery("SELECT * FROM convenio WHERE cnpj like ?",cnpj+"%");
                
                while(rs.next())
                {
                convenio.add(populateConvenio(rs));
                }
                rs.close();
        return convenio;
    }
    
    
        private Convenio populateConvenio(ResultSet rs) throws SQLException {
        Convenio retorno = new Convenio();
        
        retorno.setNome(rs.getString("nome"));
        retorno.setTelefone(rs.getString("telefone"));
        retorno.setEndereco(rs.getString("endereco"));
        retorno.setCnpj(rs.getString("cnpj"));
        
        return retorno;
        
    }
    
    
    
    public Integer addConvenio(Convenio convenio ) throws SQLException
    {
        String query = "INSERT INTO convenio(nome, telefone, endereco, cnpj ) VALUES (?,?,?,? )";
        executeComand(query, convenio.getNome(), convenio.getTelefone(),convenio.getEndereco() , convenio.getCnpj() );        
        return convenio.getId();
        
    }
    
    public void updateConvenio(Convenio convenio ) throws SQLException
    {
        String query = "UPDATE convenio SET nome = ?, telefone = ?, endereco = ?, cnpj = ? WHERE id =?";
        executeComand(query,  convenio.getNome(), convenio.getTelefone(), convenio.getEndereco(), convenio.getCnpj(), convenio.getId());        
        
    }
    
    public void deleteSecretaria(Convenio convenio) throws SQLException
    {
        String query = "DELETE FROM convenio WHERE id = ? ";
        executeComand(query, convenio.getId());
    
    }
    
    
}
