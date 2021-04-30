package com.example.APICrudPETUsuario.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Usuario {

    @Id
    @GeneratedValue

    private Long id;
    private String responsavel;
    private Integer telefone;
    private String email;
    private String senha;

}
