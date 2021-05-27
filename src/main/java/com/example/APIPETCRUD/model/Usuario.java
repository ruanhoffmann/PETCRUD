package com.example.APIPETCRUD.model;

import lombok.Getter;
import lombok.Setter;

//import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
@Getter
@Setter

public class Usuario  {

    @Id
    @GeneratedValue

    private Long id;
    private String nome;
    private String login;
    private String telefone;
    private String email;
    private String senha;
    private TipoUser tipouser;

  /*



   @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() { // retorna a senha do usuário
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
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
    }*/
}
