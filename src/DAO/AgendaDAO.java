/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */

import entidades.Agenda;
import DAO.GenericDAO;
import java.sql.SQLException;


public class AgendaDAO extends GenericDAO
{

    public Integer addAgenda(Agenda agenda) throws SQLException
    {
        String query = "INSERT INTO agenda(desc) VALUES (?)";
        executeComand(query, agenda.getDesc());        
        return agenda.getId();
        
    }
    
    public void updateAgenda(Agenda agenda) throws SQLException
    {
        String query = "UPDATE agenda SET desc WHERE id =?";
        executeComand(query, agenda.getDesc(), agenda.getId());         
        
    }
    
    public void deleteAgenda(Agenda agenda) throws SQLException
    {
        String query = "DELETE FROM agenda WHERE id = ? ";
        executeComand(query, agenda.getId());
    
    }

}