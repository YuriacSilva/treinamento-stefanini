package com.stefanini.dto;

import java.time.LocalDate;

public class FiltroPessoaDTO {
  
  private String nome;
  private String email;
  private LocalDate dataNascmento;
  private Boolean situacao;
  
  public FiltroPessoaDTO() {
    super();
  }

  public FiltroPessoaDTO(String nome, String email, LocalDate dataNascmento, Boolean situacao) {
    super();
    this.nome = nome;
    this.email = email;
    this.dataNascmento = dataNascmento;
    this.situacao = situacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDataNascmento() {
    return dataNascmento;
  }

  public void setDataNascmento(LocalDate dataNascmento) {
    this.dataNascmento = dataNascmento;
  }

  public Boolean getSituacao() {
    return situacao;
  }

  public void setSituacao(Boolean situacao) {
    this.situacao = situacao;
  }
  
}
