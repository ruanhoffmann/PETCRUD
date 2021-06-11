package com.example.APIPETCRUD.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter

public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nomeAnimal;
    private String dono;
    private String responsavelAnimal;
    private String descricaoAnimal;
    private GrupoAnimais grupoAnimais;
    private ClasseAnimais classeAnimais;
    @ManyToOne
    private Usuario user;


}
