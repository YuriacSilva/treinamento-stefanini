package com.stefanini.teste;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;


public class App {

	@Inject
	private PessoaServico pessoaServico;

	public static void main(String[] args) {
		//CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
		Pessoa pessoa = new Pessoa("joao". "joao@email.com", LocalDate.of(1955, 8, 25), Boolean.TRUE);
		pessoaDAO.salvar(pessoa);
	}

}
