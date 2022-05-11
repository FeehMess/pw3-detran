package br.com.felipe.messias.detran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipe.messias.detran.entity.Pessoa;
import br.com.felipe.messias.detran.repository.PessoaRepository;

@RestController

@RequestMapping("/pessoa")
	public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	private List<Pessoa> dados = new ArrayList<Pessoa>();
	
	@GetMapping
	public List<Pessoa> listarTodos(){
			dados = repository.findAll();
			return dados;
	}
			public Pessoa buscarPorId(Integer id) {
				Pessoa tipo = new Pessoa();
				return tipo;
			}
		@PostMapping
		public void inserir(@RequestBody Pessoa pessoa) {
			repository.save(pessoa);
	}
		@PutMapping("(/idPessoa)")
		public void atualizar(@PathVariable Integer id, @RequestBody Pessoa pessoa) {
			boolean existe = repository.existsById(id);
			if(existe)
			{
				repository.save(pessoa);
			}
		}
}
