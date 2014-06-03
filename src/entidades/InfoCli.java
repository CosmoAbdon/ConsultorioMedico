/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author zEveerY
 */
public class InfoCli {
    
    private Integer id;
    private String nome_clinica;
    private String cnpj;
    private String endereco;
    private String telefone;

    public InfoCli() {
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_clinica() {
        return nome_clinica;
    }

    public void setNome_clinica(String nome_clinica) {
        this.nome_clinica = nome_clinica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "InfoCli{" + "id=" + id + ", nome_clinica=" + nome_clinica + ", cnpj=" + cnpj + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
    


        
}
