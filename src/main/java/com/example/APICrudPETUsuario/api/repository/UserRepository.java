package com.example.APICrudPETUsuario.api.repository;

import com.example.APICrudPETUsuario.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Usuario, Long > {

}
