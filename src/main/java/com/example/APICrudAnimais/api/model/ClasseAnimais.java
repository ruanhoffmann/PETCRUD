package com.example.APICrudAnimais.api.model;

public enum ClasseAnimais {

    MAMIFERO("mamifero"),
    REPTIL("reptil"),
    AVES("aves"),
    ANFIBIOS("anfibios"),
    PEIXES("peixes");

    private String classedescricao;

    ClasseAnimais(String classedescricao){
        this.classedescricao = classedescricao;
    }

    public String getDescricao(){
        return  classedescricao;
    }
}
