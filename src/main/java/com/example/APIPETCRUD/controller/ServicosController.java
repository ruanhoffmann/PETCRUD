package com.example.APIPETCRUD.controller;

import com.example.APIPETCRUD.model.Servicos;
import com.example.APIPETCRUD.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class ServicosController {

    @Autowired
    private ServicosRepository servicosRepository;

    @PostMapping("/servicos")
    public ResponseEntity<Object> createServicos(@RequestBody Servicos servicos) {
        Servicos savedServicos = servicosRepository.save(servicos);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedServicos.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/servicos")
    public List<Servicos> getServicos(){
        return servicosRepository.findAll();
    }

    @GetMapping("/servicos{id}")
    public Servicos getServicos(@PathVariable long id){
        Optional<Servicos> servicos = servicosRepository.findById(id);

        return servicos.get();
    }

    @DeleteMapping("/servicos{id}")
    public void deleteServicos (@PathVariable long id){
        servicosRepository.deleteById(id);
    }
}
