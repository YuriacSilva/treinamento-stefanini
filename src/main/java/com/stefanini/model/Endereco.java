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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
    result = prime * result + ((cep == null) ? 0 : cep.hashCode());
    result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
    result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
    result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
    result = prime * result + ((uf == null) ? 0 : uf.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Endereco other = (Endereco) obj;
    if (bairro == null) {
      if (other.bairro != null)
        return false;
    } else if (!bairro.equals(other.bairro))
      return false;
    if (cep == null) {
      if (other.cep != null)
        return false;
    } else if (!cep.equals(other.cep))
      return false;
    if (cidade == null) {
      if (other.cidade != null)
        return false;
    } else if (!cidade.equals(other.cidade))
      return false;
    if (complemento == null) {
      if (other.complemento != null)
        return false;
    } else if (!complemento.equals(other.complemento))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (logradouro == null) {
      if (other.logradouro != null)
        return false;
    } else if (!logradouro.equals(other.logradouro))
      return false;
    if (pessoa == null) {
      if (other.pessoa != null)
        return false;
    } else if (!pessoa.equals(other.pessoa))
      return false;
    if (uf == null) {
      if (other.uf != null)
        return false;
    } else if (!uf.equals(other.uf))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Endereco [getId()=" + getId() + ", getCo_seq_pessoa()=" + getCo_seq_pessoa() + ", getLogradouro()="
        + getLogradouro() + ", getComplemento()=" + getComplemento() + ", getBairro()=" + getBairro() + ", getCidade()="
        + getCidade() + ", getUf()=" + getUf() + ", getCep()=" + getCep() + ", hashCode()=" + hashCode() + "]";
  }

  
  
}
