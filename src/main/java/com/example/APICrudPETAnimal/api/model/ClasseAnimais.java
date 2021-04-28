package com.example.APICrudPETAnimal.api.model;

public enum ClasseAnimais {

    MAMIFERO("mamifero"),
    REPTIL("reptil"),
    AVE("ave"),
    ANFIBIO("anfibio"),
    PEIXE("peixe"),
    FELINO("felino"),
    CANINO("canino") ;

    private String classedescricao;

    ClasseAnimais(String classedescricao){
        this.classedescricao = classedescricao;
    }

    public String getDescricao(){
        return  classedescricao;
    }
}
