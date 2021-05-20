package com.example.APIPETCRUD.model;

import org.apache.catalina.User;

public enum TipoUser {

    ADM("PetShopOwner"),
    CLIENTE("Cliente");

    private String UserDescricao;

    TipoUser (String UserDescricao){
        this.UserDescricao = UserDescricao;
        }

        public String getUserDescricao(){

        return UserDescricao;
    }

}
