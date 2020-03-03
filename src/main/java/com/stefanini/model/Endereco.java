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
import javax.validation.constraints.Size;

import com.stefanini.model.Pessoa;
import com.sun.istack.NotNull;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco implements Serializable {

  /**
   * Serializacao da Classe
   */
  private static final long serialVersionUID = 1L;
  /**
   * ID da Tabela
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "CO_SEQ_ENDERECO")
  private Long id;
  /**
   * FK de perfil
   */
  @Valid
  @ManyToOne
  @JoinColumn(name = "CO_SEQ_PESSOA")
  private Pessoa pessoa;
  /**
   * Logradouro do endereço
   */
  @NotNull
  @Size(min = 1, max = 150)
  @Column(name = "DS_LOGRADOURO", length = 150)
  private String logradouro;
  /**
   * Complemento do endereço
   */
  @NotNull
  @Size(min = 1, max = 150)
  @Column(name = "DS_COMPLEMENTO", length = 150)
  private String complemento;
  /**
   * Bairro
   */
  @NotNull
  @Size(min = 1, max = 250)
  @Column(name = "DS_BAIRRO", length = 250)
  private String bairro;
  /**
   * Cidade
   */
  @NotNull
  @Column(name = "DS_CIDADE")
  private String cidade;
  /**
   * UF
   */
  @NotNull
  @Column(name = "CO_UF")
  private String uf;
  /**
   * CEP
   */
  @NotNull
  @Size(min = 8, max = 8)
  @Column(name = "DS_CEP", length = 8)
  private String cep;
  
  /**
   * Construtor da classe
   */
  public Endereco() {
    
  }
  
  /**
	 * Construtor da Classe, Obrigando receber todos os parametros
	 * @param pessoa
	 * @param logradouro
	 * @param complemento
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param cep
	 */
  public Endereco(@Valid Pessoa pessoa, @NotNull String logradouro, 
		  @NotNull String complemento, @NotNull String bairro, 
		  @NotNull String cidade, @NotNull String uf, @NotNull String cep) {
    this.pessoa = pessoa;
    this.logradouro = logradouro;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.uf = uf;
    this.cep = cep;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Pessoa getCo_seq_pessoa() {
    return pessoa;
  }

  public void setCo_seq_pessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

}
