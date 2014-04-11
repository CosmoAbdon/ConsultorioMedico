/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */
import entidades.Secretaria;
import DAO.GenericDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SecretariaDAO extends GenericDAO{

    public boolean logarSecretaria(String login, String senha) throws SQLException{
    
        boolean toReturn = false;
        ResultSet rs; 
        rs = executeQuery("select * from secretaria");
        
        while (rs.next()) {
        
            if (rs.getString("senha_acesso").equals(senha) && rs.getString("rg").equals(login)) {
            
                toReturn = true;
                return true;
            } else {
                toReturn = false;
            }
        }
        return toReturn;
    }
    
    
    public Integer addSecretaria(Secretaria secretaria) throws SQLException
    {
        String query = "INSERT INTO secretaria(nome_func, cpf, rg, telefone, endereco, sexo, senha_acesso, lvl_key) VALUES (?,?,?,?,?,?,?,?)";
        executeComand(query,  secretaria.getNome_func(), secretaria.getCpf(), secretaria.getRg(), secretaria.getTelefone(),secretaria.getEndereco(), secretaria.getSexo(), secretaria.getSenha_acesso(), secretaria.getLvl_key());        
        return secretaria.getId();
        
    }
    
    public void updateSecretaria(Secretaria secretaria) throws SQLException
    {
        String query = "UPDATE secretaria SET nome_func = ?, cpf = ?, rg = ?, telefone = ?, endereco = ?, sexo = ?, senha_acesso = ?, lvl_key = ? WHERE id =?";
        executeComand(query, secretaria.getNome_func(), secretaria.getCpf(),secretaria.getRg(),secretaria.getTelefone() ,secretaria.getEndereco(), secretaria.getSexo(), secretaria.getSenha_acesso(), secretaria.getLvl_key(), secretaria.getId());         
        
    }
    
    public void deleteSecretaria(Secretaria secretaria) throws SQLException{
        String query = "DELETE FROM secretaria WHERE id = ? ";
        executeComand(query, secretaria.getId());
        
    }
    
      public Secretaria getSecretaria(Secretaria secretaria) throws SQLException 
      {
        ResultSet rs = executeQuery("SELECT * FROM secretaria WHERE rg = ?, senha_acesso = ?", secretaria.getRg(), secretaria.getSenha_acesso());        
        Secretaria usr = null;       
        return usr;
      }
    
    
}
