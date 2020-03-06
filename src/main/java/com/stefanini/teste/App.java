package com.stefanini.teste;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import com.stefanini.dto.FiltroPessoaDTO;
import com.stefanini.model.Endereco;
import com.stefanini.model.Pessoa;
import com.stefanini.servico.EnderecoServico;
import com.stefanini.servico.PerfilServico;
import com.stefanini.servico.PessoaPerfilServico;
import com.stefanini.servico.PessoaServico;

public class App {

	@Inject
	private PessoaServico servicoPessoa;
	
	@Inject
	private PerfilServico servicoPerfil;
	
	@Inject
  private PessoaPerfilServico servicoPP;
	
	@Inject
  private EnderecoServico servicoEndereco;

	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
//		buscarTodos();
//		encontrar();
		salvar();
//		remover();
	}
	
	
	private void remover() {
		servicoPessoa.remover(5L);
	}

	private void encontrar() {
		Optional<Pessoa> pessoa = servicoPessoa.encontrar(5L);
		if (pessoa.isPresent()) {
			System.out.println("Pessoa encontrada");
			System.out.println(pessoa.get());
		} else {
			System.out.println("Pessoa não encontrada");
		}
	}

	private void buscarTodos() {
		servicoPessoa.getList().ifPresent(i -> {
			i.forEach(b -> {
				System.out.println(b);
			});
		});
//		System.out.println();
	}

	public void salvar() {
	  
	  FiltroPessoaDTO filtro = new FiltroPessoaDTO("JOAO", null, null, true);
	  Optional<List<Pessoa>> list = servicoPessoa.filtro(filtro);
	  for (Pessoa pessoa : list.get()) {
      System.out.println(pessoa.toString());
    }
	  
//	  Pessoa pessoa1 = new Pessoa();
//	  pessoa1.setId(5L);
//	  
//	  servicoEndereco.salvar(new Endereco(pessoa1, "Rua das jaqueiras", "none", "cruzeiro velho", "brasília", "df", "70610410"));
//	  servicoEndereco.salvar(new Endereco(pessoa1, "Rua das jaqueiras2", "none2", "cruzeiro velho2", "brasília2", "df2", "70610412"));
	  
	  
//	  if(list.isPresent()) {
//	    System.out.println("Deu Bom : " + list.get());
//	  } else {
//	    System.out.println("Deu Ruim");
//	  }
	  
//		Pessoa pessoa = new Pessoa("JOAO", "joaom.dev@hotmail.com2", LocalDate.of(1985, 8, 24), Boolean.TRUE);
//		servicoPessoa.salvar(pessoa);
//		
//		pessoa = new Pessoa("JOAO", "joaom.dev@hotmail.com3", LocalDate.of(1924, 8, 24), Boolean.FALSE);
//    servicoPessoa.salvar(pessoa);
//    
//    pessoa = new Pessoa("YURI", "yuri.dev@hotmail.com", LocalDate.of(1988, 7, 7), Boolean.TRUE);
//    servicoPessoa.salvar(pessoa);
//    
//    pessoa = new Pessoa("YURI", "yuri.dev@hotmail.com2", LocalDate.of(1988, 7, 7), Boolean.TRUE);
//    servicoPessoa.salvar(pessoa);
	}

}
