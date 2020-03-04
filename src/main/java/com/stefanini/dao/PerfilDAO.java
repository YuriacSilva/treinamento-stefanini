package com.stefanini.dao;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Perfil;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class PerfilDAO extends GenericDao<Perfil, Long> {

	public PerfilDAO() {
		super(Perfil.class);
	}

}
