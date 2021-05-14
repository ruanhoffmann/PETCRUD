package com.example.APIPETCRUD.repository;

import com.example.APIPETCRUD.model.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends JpaRepository <Servicos, Long> {
}
