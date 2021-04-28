package com.example.APICrudPETUsuario.api.controller;

import com.example.APICrudPETUsuario.api.model.Usuario;
import com.example.APICrudPETUsuario.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/usuario")
    public ResponseEntity<Object> createUser(@RequestBody Usuario usuario){
        Usuario savedUsuario = userRepository.save(usuario);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUsuario.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/usuario")
    public List<Usuario> getUsuario(){
        return userRepository.findAll();
    }

    @GetMapping("/usuario{id}")
    public Usuario getUsuario(@PathVariable long id){
        Optional<Usuario> usuario = userRepository.findById(id);

        return usuario.get();//trás todos os atributos da classe;
    }

    @DeleteMapping("/usuario{id}")
    public void deleteUsuario (@PathVariable long id){
        userRepository.deleteById(id);
    }

}
