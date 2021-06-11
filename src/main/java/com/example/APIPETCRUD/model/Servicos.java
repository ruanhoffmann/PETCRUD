package com.example.APIPETCRUD.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String servDescricao;
    private Integer preco;
    private String titulo;

}
