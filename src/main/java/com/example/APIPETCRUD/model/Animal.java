package com.example.APIPETCRUD.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue
    private Long id;
    private String descricaoAnimal;
    private GrupoAnimais grupoAnimais;
    private ClasseAnimais classeAnimais;

    //private Usuario user;


}
