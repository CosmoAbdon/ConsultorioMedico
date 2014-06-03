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
public class Convenio {
    @SwingColumn (description="I.D")
    private Integer id ;
    @SwingColumn (description="Nome")
    private String nome;
    @SwingColumn (description="Telefone")
    private String telefone;
    @SwingColumn (description="Endereço")
    private String endereco;
    @SwingColumn (description="C.N.P.J")
    private String cnpj;

    public Convenio() {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
    
}
