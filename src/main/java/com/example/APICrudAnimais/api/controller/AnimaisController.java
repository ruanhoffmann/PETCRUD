package com.example.APICrudAnimais.api.controller;

import com.example.APICrudAnimais.api.model.Animal;//importa a classe Animal
import com.example.APICrudAnimais.api.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class AnimaisController{
    //crindo o rest controler para ajudar a identifar como a classe vai funcionar.

    @Autowired
    private AnimalRepository animalRepository; // instanciando o repository;

    @PostMapping("/animal")
    public ResponseEntity<Object> createAnimal(@RequestBody Animal animal) {
        Animal savedAnimal = animalRepository.save(animal);

        //quero que no postman me retorne algo, por isso n usa public void.

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedAnimal.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/animal")
    public List<Animal> getAnimal(){
        return animalRepository.findAll();
    }

    @GetMapping("/animal{id}")
    public Animal getAnimais(@PathVariable long id){
        Optional<Animal> animal = animalRepository.findById(id);

        return animal.get();//trás todos os atributos da classe;
    }

    @DeleteMapping("/animal{id}")
    public void deleteAnimal (@PathVariable long id){
        animalRepository.deleteById(id);
    }
}
