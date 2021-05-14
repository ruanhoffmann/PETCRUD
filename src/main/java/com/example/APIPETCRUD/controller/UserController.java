package com.example.APIPETCRUD.controller;

import com.example.APIPETCRUD.model.Usuario;
import com.example.APIPETCRUD.repository.UserRepository;
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

    @PostMapping("/user")
    public ResponseEntity<Object> createUser(@RequestBody Usuario user) {
        Usuario savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/user")
    public List<Usuario> getUser(){
        return userRepository.findAll();
    }

    @GetMapping("/user{id}")
    public Usuario getUser(@PathVariable long id){
        Optional<Usuario> user = userRepository.findById(id);

        return user.get();
    }

    @DeleteMapping("/user{id}")
    public void deleteUser (@PathVariable long id){
        userRepository.deleteById(id);
    }
}
