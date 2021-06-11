package com.example.APIPETCRUD.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nome;
    private String responsavel;
    private String login;
    private String telefone;
    private String email;
    private String senha;
    private TipoUser tipouser;
    @ManyToOne
    private Animal animal;
    @ManyToOne
    private Agendamento agen;



}
