package com.example.APIPETCRUD.repository;

import com.example.APIPETCRUD.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenRepository extends JpaRepository<Agendamento, Long> {
}
