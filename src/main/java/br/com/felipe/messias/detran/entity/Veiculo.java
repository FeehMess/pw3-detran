package br.com.felipe.messias.detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="veiculo")

public class Veiculo {
	
	@Column (name = "idVeiculo")
	@Id
	private int idVeiculo;
	
	@Column (name = "renavam")
	private String renavam;
	
	@Column (name = "placa")
	private String placa;
	
	@Column (name = "modelo")
	private String modelo;
	
	@Column (name = "ano")
	private int ano;
	
	@ManyToOne
	@JoinColumn (name = "proprietario")
	private Pessoa proprietario;
}
