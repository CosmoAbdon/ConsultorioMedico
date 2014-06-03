/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import frames.SwingColumn;

/**
 *
 * @author zEveerY
 */
public class Paciente {
    
    @SwingColumn (description="I.D")
    private Integer id;
    @SwingColumn (description="Nome")
    private String nome;
    @SwingColumn (description="Telefone")
    private String telefone;
    @SwingColumn (description="C.P.F")
    private String cpf;
    @SwingColumn (description="R.G")
    private String rg;
    @SwingColumn (description="Endereço")
    private String endereco;
    @SwingColumn (description="Sexo")
    private String sexo;
    @SwingColumn (description="Convenio")
    private String convenio;

    public Paciente() {
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
        @Override
    public String toString() {
        return nome;
    }
    
}
