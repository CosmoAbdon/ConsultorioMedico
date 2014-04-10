/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */
import entidades.Paciente;
import DAO.GenericDAO;
import java.sql.SQLException;

public class PacienteDAO extends GenericDAO{
    
    public Integer addPaciente(Paciente paciente) throws SQLException
    {
        String query = "INSERT INTO paciente(nome, telefone, cpf, rg, endereco, sexo, convenio) VALUES (?,?,?,?,?,?,?)";
        executeComand(query,  paciente.getNome(), paciente.getTelefone(), paciente.getCpf(), paciente.getRg(), paciente.getEndereco(), paciente.getSexo(), paciente.getConvenio());        
        return paciente.getId();
        
    }
    
    public void updatePaciente(Paciente paciente) throws SQLException
    {
        String query = "UPDATE paciente SET nome = ?, telefone = ?, cpf = ?, rg = ?, endereco = ?, sexo = ?, convenio = ? WHERE id =?";
        executeComand(query,  paciente.getNome(), paciente.getTelefone(), paciente.getCpf(), paciente.getRg(), paciente.getEndereco(), paciente.getSexo(), paciente.getConvenio(), paciente.getId());        
        
    }
    
    public void deletePaciente(Paciente paciente) throws SQLException{
        String query = "DELETE FROM paciente WHERE id = ? ";
        executeComand(query, paciente.getId());
        
        
    }
    
    
}
