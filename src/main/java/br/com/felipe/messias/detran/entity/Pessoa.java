package br.com.felipe.messias.detran.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Pessoa {
	private idPessoa int primary key,
	private nome varchar (40),
	private endereco varchar(50)
}