package br.com.fiap.raposymapi.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

@Entity
@Table(name = "T_SYM_USUARIO")
public class Usuario implements UserDetails{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String dtNascimento;
    private String nrTelefone;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    public Usuario nome(String nome){
        Assert.notNull(nome, "necessário inserir nome.");
        this.nome = nome;
        return this;
    }

    public Usuario email(String email){
        Assert.notNull(email, "necessario inserir email.");
        this.email = email;
        return this;
    }

    public Usuario senha(String senha){
        Assert.notNull(senha, "necessario inserir senha.");
        this.senha = senha;
        return this;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getNrTelefone() {
        return nrTelefone;
    }
    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getUsername(){
        return this.email;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getPassword() {
        return null;
    }
    
}
