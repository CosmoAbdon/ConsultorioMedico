/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.GenericDAO;
import entidades.Consultas;
import java.sql.SQLException;

/**
 *
 * @author zEveerY
 */
public class ConsultasDAO extends GenericDAO {
    
    public Integer addConsultas(Consultas consultas) throws SQLException
    {
        String query = "INSERT INTO agenda(id_med, id_pac, data, hora, ficha_medica) VALUES (?,?,?,?,?)";
        executeComand(query, consultas.getId_med(), consultas.getId_pac(), consultas.getData(), consultas.getHora(), consultas.getFicha_medica());        
        return consultas.getId();
        
    }
    
    public void updateConsultas(Consultas consultas) throws SQLException
    {
        String query = "UPDATE agenda SET desc WHERE id =?";
        executeComand(query, consultas.getId_med(), consultas.getId_pac(), consultas.getData(), consultas.getHora(), consultas.getFicha_medica(), consultas.getId());         
        
    }
    
    public void deleteConsultas(Consultas consultas) throws SQLException
    {
        String query = "DELETE FROM agenda WHERE id = ? ";
        executeComand(query, consultas.getId());
    
    }
    
    
}
