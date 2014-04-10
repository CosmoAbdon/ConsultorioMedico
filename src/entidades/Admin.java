/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author zEveerY
 */
public class Admin {
    
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private String lvl_key;

    public Admin() {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
      
    
}
