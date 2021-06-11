package com.example.APIPETCRUD.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.*;

@Entity //já diz que minha tabela é agendamento
@Getter
@Setter
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    private Long id;
    @Column(nullable = false)
    private Date dataInicial;

    @Column(nullable = false)
    private Date dataFinal;

    @Column(nullable = false)
    private Integer precoTotal;

    @Column(nullable = false)
    private String status;

}
