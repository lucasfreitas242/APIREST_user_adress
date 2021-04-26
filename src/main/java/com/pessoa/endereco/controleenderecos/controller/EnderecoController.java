package com.pessoa.endereco.controleenderecos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoa.endereco.controleenderecos.entity.EnderecoEntity;
import com.pessoa.endereco.controleenderecos.repository.IEnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
	@Autowired
	private IEnderecoRepository enderecoRepository;
	
	@PostMapping
	public ResponseEntity <Boolean> cadastrarEndereco(@RequestBody EnderecoEntity endereco){
		try {
			this.enderecoRepository.save(endereco);
			return ResponseEntity.status(HttpStatus.CREATED).body(true);
		}catch (Exception d) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
		}
	}
	

}
