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
public class Medicos {
    
    @SwingColumn (description="I.D")
    private Integer id;
    @SwingColumn (description="C.R.M")
    private String crm;
    @SwingColumn (description="Nome")
    private String nome_medico;
    @SwingColumn (description="R.G")
    private String rg;
    @SwingColumn (description="C.P.F")
    private String cpf;
    @SwingColumn (description="Telefone")
    private String telefone;
    @SwingColumn (description="Sexo")
    private String sexo;
    private String senha_acesso;
    private String lvl_key;
    
    public Medicos() {
    }

    public String getLvl_key() {
        return lvl_key;
    }

    public void setLvl_key(String lvl_key) {
        this.lvl_key = lvl_key;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha_acesso() {
        return senha_acesso;
    }

    public void setSenha_acesso(String senha_acesso) {
        this.senha_acesso = senha_acesso;
    }
    
        @Override
    public String toString() {
        return nome_medico;
    }
    
}
