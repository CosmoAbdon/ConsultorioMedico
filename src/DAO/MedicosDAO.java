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
    
    public Integer addMedicos(Medicos medicos ) throws SQLException
    {
        String query = "INSERT INTO medicos(crm, nome_medico, cpf, rg, telefone, sexo, senha_acesso, lvl_key) VALUES (?,?,?,?,?,?,?,?)";
        executeComand(query, medicos.getCrm(), medicos.getNome_medico(), medicos.getCpf(), medicos.getRg(), medicos.getTelefone(), medicos.getSexo(), medicos.getSenha_acesso(), medicos.getLvl_key());
        return medicos.getId();
        
    }
    
    public void updateMedicos(Medicos medicos) throws SQLException
    {
        String query = "UPDATE medicos SET crm = ?, nome_medico = ?, cpf = ?, rg = ?, telefone = ?, sexo = ?, senha_acesso = ?, lvl_key = ? WHERE id =?";
        executeComand(query, medicos.getCrm(), medicos.getNome_medico(), medicos.getCpf(), medicos.getRg(), medicos.getTelefone(), medicos.getSexo(), medicos.getSenha_acesso(), medicos.getLvl_key(), medicos.getId());        
        
    }
    
    public void deleteMedicos(Medicos medicos ) throws SQLException
    {
        String query = "DELETE FROM medicos WHERE id = ? ";
        executeComand(query, medicos.getId());
    
    }
    
}
