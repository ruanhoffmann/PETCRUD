package com.example.APICrudPETAgendamento.repository;

import com.example.APICrudPETAgendamento.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenRepository extends JpaRepository<Agendamento, Long> {
}
