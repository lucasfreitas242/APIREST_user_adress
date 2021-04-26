package com.pessoa.endereco.controleenderecos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoa.endereco.controleenderecos.entity.PessoaEntity;
import com.pessoa.endereco.controleenderecos.repository.IPessoarepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private IPessoarepository pessoaRepository;
	

	@PostMapping
	public ResponseEntity <Boolean> cadastrarPessoa(@RequestBody PessoaEntity pessoa){
		try {
			this.pessoaRepository.save(pessoa);
			return ResponseEntity.status(HttpStatus.CREATED).body(true);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
		}
	}
	
	@GetMapping
	public ResponseEntity<List<PessoaEntity>> listaPessoa(){
	return ResponseEntity.status(HttpStatus.OK).body(pessoaRepository.findAll());
	}

}
