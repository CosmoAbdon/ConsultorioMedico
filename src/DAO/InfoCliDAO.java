/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */

import entidades.InfoCli;
import java.sql.SQLException;
import DAO.GenericDAO;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class InfoCliDAO extends GenericDAO{
    
    
        public List<InfoCli> getAllInfoCli() throws SQLException 
    {
        List<InfoCli> infoCli = new LinkedList<InfoCli>();
        
            ResultSet rs = executeQuery("SELECT * FROM info_cli");
                
                while(rs.next())
                {
                infoCli.add(populateInfoCli(rs));
                }
                rs.close();
        return infoCli;
    }
        
        public InfoCli getInfoCli() throws SQLException 
    {
        InfoCli infoCli = null;
        
            ResultSet rs = executeQuery("SELECT * FROM info_cli");
                
                if(rs.next())
                {
                infoCli =populateInfoCli(rs);
                }
                rs.close();
        return infoCli;
    }
    
        private InfoCli populateInfoCli(ResultSet rs) throws SQLException {
        InfoCli retorno = new InfoCli();
        
        retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setNome_clinica(rs.getString("nome_clinica"));
        retorno.setCnpj(rs.getString("cnpj"));
        retorno.setEndereco(rs.getString("endereco"));
        retorno.setTelefone(rs.getString("telefone"));
        
        return retorno;
        
    }
        
    
    public boolean ValidaInfoCli() throws SQLException{
    
        boolean toReturn = false;
        ResultSet rs; 
        rs = executeQuery("select * from info_cli");
        
        while (rs.next()) {
        
            if (rs.getInt("id") == 1) {
            
                toReturn = true;
                //return true;
            } 
        }
        return toReturn;
    }
    
    
    public Integer addInfoCli(InfoCli infocli ) throws SQLException
    {
        String query = "INSERT INTO info_cli(nome_clinica, cnpj, endereco, telefone ) VALUES (?,?,?,? )";
        executeComand(query, infocli.getNome_clinica(), infocli.getCnpj(), infocli.getEndereco(), infocli.getTelefone());        
        return infocli.getId();
        
    }
    
    public void updateInfoCli(InfoCli infocli ) throws SQLException
    {
        String query = "UPDATE info_cli SET nome_clinica = ?, cnpj = ?, endereco = ?, telefone = ? WHERE id = 1 ";
        executeComand(query,  infocli.getNome_clinica(), infocli.getCnpj(), infocli.getEndereco(), infocli.getTelefone());        
        
    }
    
    public void deleteInfoCli(InfoCli infocli ) throws SQLException
    {
        String query = "DELETE FROM info_cli WHERE id = ? ";
        executeComand(query, infocli.getId());
    
    }
    
}
