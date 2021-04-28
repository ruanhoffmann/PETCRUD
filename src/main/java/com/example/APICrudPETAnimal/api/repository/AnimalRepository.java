package com.example.APICrudPETAnimal.api.repository;

import com.example.APICrudPETAnimal.api.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository <Animal, Long> {
}
