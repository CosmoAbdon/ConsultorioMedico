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

public class InfoCliDAO extends GenericDAO{
    
    public Integer addInfoCli(InfoCli infocli ) throws SQLException
    {
        String query = "INSERT INTO info_cli(nome_clinica, cnpj, endereco, telefone ) VALUES (?,?,?,? )";
        executeComand(query, infocli.getNome_clinica(), infocli.getCnpj(), infocli.getEndereco(), infocli.getTelefone());        
        return infocli.getId();
        
    }
    
    public void updateInfoCli(InfoCli infocli ) throws SQLException
    {
        String query = "UPDATE info_cli SET nome_clinica = ?, cnpj = ?, endereco = ?, telefone = ? WHERE id =?";
        executeComand(query,  infocli.getNome_clinica(), infocli.getCnpj(), infocli.getEndereco(), infocli.getTelefone(), infocli.getId());        
        
    }
    
    public void deleteInfoCli(InfoCli infocli ) throws SQLException
    {
        String query = "DELETE FROM info_cli WHERE id = ? ";
        executeComand(query, infocli.getId());
    
    }
    
}
