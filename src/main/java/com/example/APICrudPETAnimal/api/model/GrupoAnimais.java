package com.example.APICrudPETAnimal.api.model;

public enum GrupoAnimais {

    TERRESTRE("terrestre"),
    AQUATICO("aquatico"),
    AEREO("aereo");

    private String grupodescricao;

    GrupoAnimais(String grupodescricao){
        this.grupodescricao = grupodescricao;
    }

    public String getgrupoDescricao(){
        return  grupodescricao;
    }
}
