package br.com.felipe.messias.detran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.messias.detran.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
}
