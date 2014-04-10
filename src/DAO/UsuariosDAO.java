/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Admin;
import entidades.Medicos;
import entidades.Secretaria;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zEveerY
 */
public class UsuariosDAO extends GenericDAO {
    
    // DAO Secretária
    
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
    
      
      // DAO Admin
      
      
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
    
    
    
    //DAO Médicos
    
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
