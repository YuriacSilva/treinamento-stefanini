package com.stefanini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table(name = "TB_PESSOA_PERFIL")
public class PessoaPerfil implements Serializable {

  /**
   * Serializacao da Classe
   */
  private static final long serialVersionUID = 1L;
  /**
   * ID da Tabela
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CO_SEQ_PESSOAL_PERFIL")
  private Long id;
  /**
   * FK de pessoa
   */
  @Valid
  @ManyToOne
  @JoinColumn(name = "CO_SEQ_PESSOA")
  private Pessoa pessoa;
  /**
   * FK de perfil
   */
  @Valid
  @ManyToOne
  @JoinColumn(name = "CO_SEQ_PERFIL")
  private Perfil perfil;
  
  /**
   * Construtor da classe
   */
  public PessoaPerfil() {
    
  }
  
  /**
   * Construtor da Classe, Obrigando receber todos os parametros
   * @param pessoa
   * @param perfil
   */
  public PessoaPerfil(@Valid Pessoa pessoa, @Valid Perfil perfil) {
    super();
    this.pessoa = pessoa;
    this.perfil = perfil;
  }

  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  public Perfil getPerfil() {
    return perfil;
  }

  public void setPerfil(Perfil perfil) {
    this.perfil = perfil;
  }
  
}
