package com.stefanini.service;

public class PessoaService implements IGenericSevice<Pessoa, Long> {
	
	/**
	 * Salvar uma entidade
	 * @param entity
	 * @return
	 */
	public Pessoa salvar(@Valid Pessoa pessoa) {
		pessoa.setNome(pessoa.getNome() + " - treinamento");
		if(pessoa.getNome().toUpperCase().contains("A")) {
			pessoa.setSituacao(Boolean.FALSE);
		}
		return pessoaDao.salvar(pessoa);
	}
	
	/**
	 * 
	 * @param entity
	 * @return
	 */
	public Pessoa atualizar(@Valid Pessoa pessoa) {
		
	}

	public void remover(Long id) {
		
	}

	public List<Pessoa> getList();

	public Pessoa encontrar(Long id);
}