/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */

import entidades.PlanosConvenios;
import java.sql.SQLException;
import DAO.GenericDAO;

public class PlanosConvenioDAO extends GenericDAO{
    
    public Integer addPlanosConvenios(PlanosConvenios planosConvenios ) throws SQLException
    {
        String query = "INSERT INTO planos_convenios(planos, preco, gravidade ) VALUES (?,?,? )";
        executeComand(query, planosConvenios.getPlanos(), planosConvenios.getPreco(), planosConvenios.getGravidade());        
        return planosConvenios.getId();
        
    }
    
    public void updatePlanosConvenios(PlanosConvenios planosConvenios ) throws SQLException
    {
        String query = "UPDATE planos_convenios SET planos = ?, preco = ?, gravidade = ? WHERE id =?";
        executeComand(query,  planosConvenios.getPlanos(), planosConvenios.getPreco(), planosConvenios.getGravidade(), planosConvenios.getId());        
        
    }
    
    public void deletePlanosConvenios(PlanosConvenios planosConvenios ) throws SQLException
    {
        String query = "DELETE FROM planos_convenios WHERE id = ? ";
        executeComand(query, planosConvenios.getId());
    
    }
    
}
