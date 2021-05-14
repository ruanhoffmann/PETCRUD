package com.example.APIPETCRUD.repository;

import com.example.APIPETCRUD.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository <Animal, Long> {
}
