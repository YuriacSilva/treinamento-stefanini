package com.stefanini.teste;

import javax.persistence.Persistance;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

import com.stefanini.model.Pessoa;

public class PessoaTeste {
	
	public static void main(String []args){
		
		EntityManagerFactory emf = Persistance.createEntityManagerFactory("jpa"); // nome definido no persistance.xml linha 9
		EntityManager em = emf.createentitymanager();
		
		em.gettransaction().begin();
		
		Pessoa pessoa = new Pessoa("joao". "joao@email.com", LocalDate.of(1955, 8, 25), Boolean.TRUE);
		pessoa.setNome(null);
		
		
		em.persist(pessoa);
		em.gettransaction().commit();
		// em.flush();
		em.close();
		emf.close();
	}
}