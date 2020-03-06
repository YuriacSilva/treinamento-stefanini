package com.stefanini.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.TypedQuery;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.dto.FiltroPessoaDTO;
import com.stefanini.model.Pessoa;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class PessoaDao extends GenericDao<Pessoa, Long> {

	public PessoaDao() {
		super(Pessoa.class);
	}
	
	public Optional<List<Pessoa>> filtro(FiltroPessoaDTO filtro) {
	  String nome = filtro.getNome();
	  String email = filtro.getEmail();
	  LocalDate dataNascimento = filtro.getDataNascmento();
	  Boolean situacao = filtro.getSituacao();
	  Boolean flag = false;
	  
	  StringBuilder sql = new StringBuilder();
	  sql.append("SELECT p FROM Pessoa p WHERE");
	  
	  if(Objects.nonNull(nome)) {
	    sql.append(" p.nome LIKE :nome");
	    flag = true;
	  } 
	  if(Objects.nonNull(email)) {
	    if(flag) {
	      sql.append(" AND");
	    }
	    sql.append(" p.email LIKE :email");
	    flag = true;
	  }
	  if(Objects.nonNull(dataNascimento)) {
      if(flag) {
        sql.append(" AND");
      }
      sql.append(" p.dataNascimento = :dataNascimento");
      flag = true;
    }
	  if(Objects.nonNull(situacao)) {
      if(flag) {
        sql.append(" AND");
      }
      sql.append(" p.situacao = :situacao");
    }
	  
	  TypedQuery<Pessoa> query = getEntityManager().createQuery(sql.toString(), Pessoa.class);
	  
	  if(Objects.nonNull(nome)) {
	    query.setParameter("nome", nome);
    } 
    if(Objects.nonNull(email)) {
      query.setParameter("email", email);
    }
    if(Objects.nonNull(dataNascimento)) {
      query.setParameter("dataNascimento", dataNascimento);
    }
    if(Objects.nonNull(situacao)) {
      query.setParameter("situacao", situacao);
    }
	  
	  return Optional.of(query.getResultList());
	}
	
}
