package com.br.dtermination.dtermination.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Usuario {

public Usuario() {}
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

 @JsonProperty
    private Long id;

 @JsonProperty
    private String nome;

 @JsonProperty
    private String email;

 @JsonProperty
    private  String senha;

 @OneToOne
 @JoinColumn (name ="idFicha")
 @JsonProperty
    private  Ficha ficha;

    public String getNome(){
        return nome;
    }

     public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public  Ficha getFicha(){
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Usuario(Long id, String nome, String email, String senha, Ficha ficha){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ficha = ficha;
    }
}
