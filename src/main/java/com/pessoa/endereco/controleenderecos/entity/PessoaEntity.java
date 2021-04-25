package com.pessoa.endereco.controleenderecos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_pessoa")
public class PessoaEntity {
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@Column(name = "pessoa_cpf")
	private Long cpf;
	
	@Column(name = "pessoa_nome")
	private String nome;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "pessoa_email")
	private String email;
	
	@Column(name = "pessoa_nasc")
	private String nascimento;
	

}
