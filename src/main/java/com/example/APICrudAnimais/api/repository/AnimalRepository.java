package com.example.APICrudAnimais.api.repository;

import com.example.APICrudAnimais.api.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Criando repositório que extende as funcionalidades de JPA,
// passando objeto animal e usando o ID usando como referência.
@Repository
public interface AnimalRepository extends JpaRepository <Animal, Long> {
}
