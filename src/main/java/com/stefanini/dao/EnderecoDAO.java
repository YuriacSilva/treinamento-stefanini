package com.stefanini.dao;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Endereco;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class EnderecoDAO extends GenericDao<Endereco, Long> {

	public EnderecoDAO() {
		super(Endereco.class);
	}

}
