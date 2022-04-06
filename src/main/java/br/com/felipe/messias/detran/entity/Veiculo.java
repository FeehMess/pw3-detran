package br.com.felipe.messias.detran.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Veiculo {
	idVeiculo int primary key,
	renavam varchar(10) not null,
	placa varchar(8) not null,
	modelo varchar(20) not null,
	ano int not null,
	proprietario int references Pessoa,
}
