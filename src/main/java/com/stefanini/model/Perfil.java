package com.stefanini.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {

  /**
   * Serializacao da Classe
   */
  private static final long serialVersionUID = 1L;
  /**
   * ID da Tabela
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CO_SEQ_PERFIL")
  private Long id;
  /**
   * Nome do parfil
   */
  @NotNull
  @Size(min = 1, max = 255)
  @Column(name = "NO_PERFIL", length = 255)
  private String nomePerfil;
  /**
   * Descrição do perfil
   */
  @NotNull
  @Size(min = 1, max = 1000)
  @Column(name = "DS_PERFIL", length = 1000)
  private String descricaoPerfil;
  /**
   * Data de criação do registro
   */
  @NotNull
  @Column(name = "DT_HORA_INCLUSAO")
  private LocalDate dataInclusao;
  /**
   * Data de alteração do registro
   */
  @Column(name = "DT_HORA_ALTERACAO")
  private LocalDate dataAlteracao;
  /**
   * Lista com todas as pessoas com este perfil
   */
  @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
  private List<PessoaPerfil> pessoaPerfil = new ArrayList<PessoaPerfil>();
  
  /**
   * Construtor da classe
   */
  public Perfil () {
    
  }

  /**
   * Construtor da Classe, Obrigando receber todos os parametros
   * @param nomePerfil
   * @param descricaoPerfil
   * @param dataInclusao
   * @param dataAlteracao
   */
  public Perfil(@NotNull String nomePerfil, @NotNull String descricaoPerfil, 
		  @NotNull LocalDate dataInclusao, LocalDate dataAlteracao) {
    super();
    this.nomePerfil = nomePerfil;
    this.descricaoPerfil = descricaoPerfil;
    this.dataInclusao = dataInclusao;
    this.dataAlteracao = dataAlteracao;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNomePerfil() {
    return nomePerfil;
  }

  public void setNomePerfil(String nomePerfil) {
    this.nomePerfil = nomePerfil;
  }

  public String getDescricaoPerfil() {
    return descricaoPerfil;
  }

  public void setDescricaoPerfil(String descricaoPerfil) {
    this.descricaoPerfil = descricaoPerfil;
  }

  public LocalDate getDataInclusao() {
    return dataInclusao;
  }

  public void setDataInclusao(LocalDate dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  public LocalDate getDataAlteracao() {
    return dataAlteracao;
  }

  public void setDataAlteracao(LocalDate dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((dataAlteracao == null) ? 0 : dataAlteracao.hashCode());
    result = prime * result + ((dataInclusao == null) ? 0 : dataInclusao.hashCode());
    result = prime * result + ((descricaoPerfil == null) ? 0 : descricaoPerfil.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((nomePerfil == null) ? 0 : nomePerfil.hashCode());
    result = prime * result + ((pessoaPerfil == null) ? 0 : pessoaPerfil.hashCode());
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
    Perfil other = (Perfil) obj;
    if (dataAlteracao == null) {
      if (other.dataAlteracao != null)
        return false;
    } else if (!dataAlteracao.equals(other.dataAlteracao))
      return false;
    if (dataInclusao == null) {
      if (other.dataInclusao != null)
        return false;
    } else if (!dataInclusao.equals(other.dataInclusao))
      return false;
    if (descricaoPerfil == null) {
      if (other.descricaoPerfil != null)
        return false;
    } else if (!descricaoPerfil.equals(other.descricaoPerfil))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (nomePerfil == null) {
      if (other.nomePerfil != null)
        return false;
    } else if (!nomePerfil.equals(other.nomePerfil))
      return false;
    if (pessoaPerfil == null) {
      if (other.pessoaPerfil != null)
        return false;
    } else if (!pessoaPerfil.equals(other.pessoaPerfil))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Perfil [getId()=" + getId() + ", getNomePerfil()=" + getNomePerfil() + ", getDescricaoPerfil()="
        + getDescricaoPerfil() + ", getDataInclusao()=" + getDataInclusao() + ", getDataAlteracao()="
        + getDataAlteracao() + ", hashCode()=" + hashCode() + "]";
  }
  
  
  
}
