//package com.example.APIPETCRUD.security;
/*
import com.example.APIPETCRUD.model.Usuario;
import com.example.APIPETCRUD.repository.UserRepository;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
*/import org.springframework.stereotype.Repository;

import java.util.Optional;
/*
@Repository
public class ImplementsUserDetailsService  implements UserDetailsService {

    @Autowired
    private UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Usuario usuario = ur.findById(id);

        if (usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return usuario;
    }
}
*/