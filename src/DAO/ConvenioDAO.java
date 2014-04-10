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

public class ConvenioDAO extends GenericDAO {
    
    public Integer addConvenio(Convenio convenio ) throws SQLException
    {
        String query = "INSERT INTO convenio(nome, telefone, endereco, cnpj ) VALUES (?,?,?,? )";
        executeComand(query, convenio.getNome(), convenio.getTelefone(),convenio.getEndereco() , convenio.getCnpj() );        
        return convenio.getId();
        
    }
    
    public void updateConvenio(Convenio convenio ) throws SQLException
    {
        String query = "UPDATE paciente SET nome = ?, telefone = ?, endereco = ?, cnpj = ? WHERE id =?";
        executeComand(query,  convenio.getNome(), convenio.getTelefone(), convenio.getEndereco(), convenio.getCnpj(), convenio.getId());        
        
    }
    
    public void deleteSecretaria(Convenio convenio) throws SQLException
    {
        String query = "DELETE FROM convenio WHERE id = ? ";
        executeComand(query, convenio.getId());
    
    }
    
}
