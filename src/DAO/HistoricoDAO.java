/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author zEveerY
 */

import entidades.Historico;
import DAO.GenericDAO;
import java.sql.SQLException;

public class HistoricoDAO extends GenericDAO{
    
    public Integer addHistorico(Historico historico ) throws SQLException
    {
        String query = "INSERT INTO historico(antec_medicos, sintomas, hipot_diag, medica_presc, exam_apar_e_sist, exam_complem ) VALUES (?,?,?,?,?,?)";
        executeComand(query, historico.getAntec_medicos(), historico.getSintomas(), historico.getHipot_diago(), historico.getMedica_presc(), historico.getExam_apar_e_sist(), historico.getExam_complem());        
        return historico.getId();
        
    }
    
    public void updateHistorico(Historico historico ) throws SQLException
    {
        String query = "UPDATE historico SET antec_medicos = ?, sintomas = ?, hipot_diag = ?, medica_presc = ?, exam_apar_e_sist = ?, exam_complem = ? WHERE id =?";
        executeComand(query,  historico.getAntec_medicos(), historico.getSintomas(), historico.getHipot_diago(), historico.getMedica_presc(), historico.getExam_apar_e_sist(), historico.getExam_complem(), historico.getId());        
        
    }
    
    public void deleteHistorico(Historico historico ) throws SQLException
    {
        String query = "DELETE FROM historico WHERE id = ? ";
        executeComand(query, historico.getId());
    
    }
    
}
