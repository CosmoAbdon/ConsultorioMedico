/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.GenericDAO;
import entidades.Consultas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author zEveerY
 */
public class ConsultasDAO extends GenericDAO {
    
    
    public List<Consultas> getAllConsultas() throws SQLException 
    {
        List<Consultas> consultas = new LinkedList<Consultas>();
        
        ResultSet rs = executeQuery("SELECT * FROM consultas ");
                
                while(rs.next())
                {
                consultas.add(populateConsultas(rs));
                }
                rs.close();
        return consultas;
    }
    
        private Consultas populateConsultas(ResultSet rs) throws SQLException {
        Consultas retorno = new Consultas();
        
        //retorno.setId(Integer.parseInt(rs.getString("id")));
        retorno.setNome_med(rs.getString("nome_med"));
        retorno.setNome_pac(rs.getString("nome_pac"));
        retorno.setData(rs.getString("data"));
        retorno.setHora(rs.getString("hora"));
        retorno.setFicha_medica(rs.getString("ficha_medica"));
        
        
        return retorno;
        
    }
    
    
    public Integer addConsultas(Consultas consultas) throws SQLException
    {
        String query = "INSERT INTO consultas(nome_med, nome_pac, data, hora, ficha_medica) VALUES (?,?,?,?,?)";
        executeComand(query, consultas.getNome_med(), consultas.getNome_pac(), consultas.getData(), consultas.getHora(), consultas.getFicha_medica());        
        return consultas.getId();
        
    }
    
    public void updateConsultas(Consultas consultas) throws SQLException
    {
        String query = "UPDATE consultas SET desc WHERE id =?";
        executeComand(query, consultas.getNome_med(), consultas.getNome_pac(), consultas.getData(), consultas.getHora(), consultas.getFicha_medica(), consultas.getId());         
        
    }
    
    public void deleteConsultas(Consultas consultas) throws SQLException
    {
        String query = "DELETE FROM consultas WHERE id = ? ";
        executeComand(query, consultas.getId());
    
    }
    
    
}
