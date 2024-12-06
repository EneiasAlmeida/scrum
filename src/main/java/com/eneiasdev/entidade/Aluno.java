package com.eneiasdev.entidade;

public class Aluno {
    private int id;         // Esse id é um atributo da classe
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    public int getId(){
        return id;
    }
    public void setId(int id){ // Esse
        this.id = id;
    }public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
