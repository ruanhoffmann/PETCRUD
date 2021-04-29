package com.example.APICrudPETServicos.repository;

import com.example.APICrudPETServicos.model.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends JpaRepository <Servicos, Long> {
}
