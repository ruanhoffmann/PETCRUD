package com.example.APICrudPETAgendamento.controller;

import com.example.APICrudPETAgendamento.model.Agendamento;
import com.example.APICrudPETAgendamento.repository.AgenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class AgenController {

    @Autowired
    private AgenRepository agenRepository;

    @PostMapping("/agendamento")
    public ResponseEntity<Object> createAgendamento(@RequestBody Agendamento agen){
        Agendamento savedAgen = agenRepository.save(agen);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedAgen.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/agendamento")
    public List<Agendamento> getAgen(){
        return agenRepository.findAll();
    }

    @GetMapping("/agendamento{id}")
    public Agendamento getAgen(@PathVariable long id){
        Optional<Agendamento> agen = agenRepository.findById(id);

        return agen.get();
    }

    @DeleteMapping("/agendamento{id}")
    public void deleteAgen (@PathVariable long id){
        agenRepository.deleteById(id);
    }
}




