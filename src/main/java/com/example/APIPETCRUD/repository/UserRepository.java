package com.example.APIPETCRUD.repository;

import com.example.APIPETCRUD.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Usuario, Long> {

}
