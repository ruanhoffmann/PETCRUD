package com.example.APIPETCRUD.controller;

import com.example.APIPETCRUD.repository.UserRepository;
import com.example.APIPETCRUD.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    //CRIAÇÃO DE USUÁRIO
    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> createUser(@RequestBody Usuario user) { //cria o usuário e salva ele.
        Usuario savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    //LISTA O USUÁRIO
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user") //retorna uma lista de usuário.
    public List<Usuario> getUser(){
        return userRepository.findAll();
    }

    //RETORNA O USUÁRIO
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user{id}") // retorna tudo da classe usuário.
    public Usuario getUser(@PathVariable long id){
        Optional<Usuario> user = userRepository.findById(id);

        return user.get();
    }

    //DELETA O USUÁRIO
    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/user{id}") //deletar o usuário
    public void deleteUser (@PathVariable long id){
        userRepository.deleteById(id);
    }


}
