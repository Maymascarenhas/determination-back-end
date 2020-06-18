package com.br.dtermination.dtermination.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;


@Embeddable
public class Credenciais {
    @JsonProperty
    private String email;
    @JsonProperty
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
