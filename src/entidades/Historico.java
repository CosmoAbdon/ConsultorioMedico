/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author zEveerY
 */
public class Historico {
 
    private Integer id;
    private String antec_medicos;
    private String sintomas;
    private String hipot_diago;
    private String medica_presc;
    private String exam_apar_e_sist;
    private String exam_complem;

    public Historico() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAntec_medicos() {
        return antec_medicos;
    }

    public void setAntec_medicos(String antec_medicos) {
        this.antec_medicos = antec_medicos;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getHipot_diago() {
        return hipot_diago;
    }

    public void setHipot_diago(String hipot_diago) {
        this.hipot_diago = hipot_diago;
    }

    public String getMedica_presc() {
        return medica_presc;
    }

    public void setMedica_presc(String medica_presc) {
        this.medica_presc = medica_presc;
    }

    public String getExam_apar_e_sist() {
        return exam_apar_e_sist;
    }

    public void setExam_apar_e_sist(String exam_apar_e_sist) {
        this.exam_apar_e_sist = exam_apar_e_sist;
    }

    public String getExam_complem() {
        return exam_complem;
    }

    public void setExam_complem(String exam_complem) {
        this.exam_complem = exam_complem;
    }
    
    
    
    
    
}
