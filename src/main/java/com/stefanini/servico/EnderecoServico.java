package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.EnderecoDAO;
import com.stefanini.model.Endereco;
import com.stefanini.util.IGenericService;

/**
 * 
 * Classe de servico, as regras de negocio devem estar nessa classe
 * @author joaopedromilhome
 *
 */
public class EnderecoServico implements IGenericService<Endereco, Long> {
	
	@Inject
	private EnderecoDAO dao;
	
	/**
	 * Salvar os dados de um Endereço
	 */
	public Endereco salvar(@Valid Endereco endereco) {
		return dao.salvar(endereco);
	}

	/**
	 * Atualizar o dados de um Endereço
	 */
	@Override
	public Endereco atualizar(@Valid Endereco entity) {
		return dao.atualizar(entity);
	}

	/**
	 * Remover um Endereço pelo id
	 */
	@Override
	public void remover(@Valid Long id) {
		dao.remover(id);		
	}

	/**
	 * Buscar uma lista de Endereços
	 */
	@Override
	public Optional<List<Endereco>> getList() {
		return dao.getList();
	}

	/**
	 * Buscar um Endereço pelo ID
	 */
	@Override
	public Optional<Endereco> encontrar(Long id) {
		return dao.encontrar(id);
	}

}
