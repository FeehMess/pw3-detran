package br.com.felipe.messias.detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pessoa")

public class Pessoa {
	@Column (name = "idPessoa")
	@Id
	private int idPessoa;
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "nome")
	private String endereco;
}