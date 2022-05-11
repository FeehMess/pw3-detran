package br.com.felipe.messias.detran.entity;

import java.time.LocalDate;

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
@Table(name="multa")

public class Multa {
	@Column (name = "idMulta")
	@Id
	private int id;
	
	@Column (name = "vencimento")
	private LocalDate vencimento;
	
	@Column (name = "estadoMulta")
	private String estadoMulta;
	
	@Column (name = "orgao")
	private String orgao;
	
	@ManyToOne
	@JoinColumn (name = "veiculo")
	private Veiculo veiculo;
}
