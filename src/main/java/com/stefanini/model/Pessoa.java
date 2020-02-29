package com.stefanini.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.NotNull;

@Entity
@Table(name="TB_PESSOA")
public class Pessoa{
	
	@Id
	@GeneratedValue(Strategy = GenerationType.AUTO)
	@Column(name="co_seq_pessoa")
	private Long id;
	
	@NotNull
	@Column(name="no_pessoa")
	private String nome;
	
	@Email
	@NotNull
	@Column(name="ds_email")
	private String email;
	
	@Column(name="dt_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name="st_pessoa")
	private Boolean situacao;
	
	// TODO criar getters and setters
	
	public Pessoa (String nome, String email, LocalDate dataNascimento, Boolean situacao){
		super();
		this.nome = nome;
		this.email = nome;
		this.dataNascimento = dataNascimento;
		this.situacao = situacao;
	}
	
	@Override
	public String toString(){
		return "Pessoa.getNome() = " + this.getNome() + 
			"Pessoa.getEmail() = " + this.getEmail() + 
			"Pessoa.getDataNascimento() = " + this.getDataNascimento() + 
			"Pessoa.getSituacao()= " + this.getSituacao() + 
	}
	
	@Override
}