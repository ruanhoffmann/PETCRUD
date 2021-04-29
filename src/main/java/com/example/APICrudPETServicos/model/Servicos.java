package com.example.APICrudPETServicos.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Servicos {

    @Id
    @GeneratedValue
    private Long id;
    private String servDescricao;
    private Integer preco;
    private String titulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServDescricao() {
        return servDescricao;
    }

    public void setServDescricao(String servDescricao) {
        this.servDescricao = servDescricao;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
