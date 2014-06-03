/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import frames.SwingColumn;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author zEveerY
 */
public class Consultas {
    
    private Integer id;
    @SwingColumn (description="Médico")
    private String nome_med;
    @SwingColumn (description="Paciente")
    private String nome_pac;
    @SwingColumn (description="Data")
    private String data;
    @SwingColumn (description="Hora")
    private String hora;
    @SwingColumn (description="Ficha Médica")
    private String ficha_medica;

    public Consultas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_med() {
        return nome_med;
    }

    public void setNome_med(String nome_med) {
        this.nome_med = nome_med;
    }

    public String getNome_pac() {
        return nome_pac;
    }

    public void setNome_pac(String nome_pac) {
        this.nome_pac = nome_pac;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFicha_medica() {
        return ficha_medica;
    }

    public void setFicha_medica(String ficha_medica) {
        this.ficha_medica = ficha_medica;
    }
   
    
    
}
