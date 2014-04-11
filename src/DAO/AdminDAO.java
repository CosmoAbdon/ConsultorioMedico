/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */
import entidades.Admin;
import DAO.GenericDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO extends GenericDAO{
    
    
    public boolean logarAdmin(String login, String senha) throws SQLException{
    
        boolean toReturn = false;
        ResultSet rs; 
        rs = executeQuery("select * from admin");
        
        while (rs.next()) {
        
            if (rs.getString("senha").equals(senha) && rs.getString("login").equals(login)) {
            
                toReturn = true;
                return true;
            } else {
                toReturn = false;
            }
        }
        return toReturn;
    }
    
    public Integer addAdmin(Admin admin) throws SQLException
    {
        String query = "INSERT INTO admin(nome, login, senha, lvl_key) VALUES (?,?,?,?)";
        executeComand(query, admin.getNome(), admin.getLogin(), admin.getSenha(), admin.getLvl_key());        
        return admin.getId();
        
    }
    
    public void updateSAdmin(Admin admin) throws SQLException
    {
        String query = "UPDATE admin SET nome = ?, login = ?, senha = ?, lvl_key = ? WHERE id =?";
        executeComand(query, admin.getNome(), admin.getLogin(), admin.getSenha(), admin.getLvl_key(), admin.getId());         
        
    }
    
    public void deleteAdmin(Admin admin) throws SQLException
    {
        String query = "DELETE FROM admin WHERE id = ? ";
        executeComand(query, admin.getId());
    
    }
    
}
