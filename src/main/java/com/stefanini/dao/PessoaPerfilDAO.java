package com.stefanini.dao;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.PessoaPerfil;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class PessoaPerfilDAO extends GenericDao<PessoaPerfil, Long> {

	public PessoaPerfilDAO() {
		super(PessoaPerfil.class);
	}

}
