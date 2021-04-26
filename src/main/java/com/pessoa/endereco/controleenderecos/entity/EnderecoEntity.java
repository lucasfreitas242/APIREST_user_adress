package com.pessoa.endereco.controleenderecos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_endereco")
public class EnderecoEntity  implements Serializable{
	

	private static final long serialVersionUID = -5479313529209108102L;
	

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private Long id;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "endereco_log")
	private String logradouro;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "endereco_num")
	private Long numero;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "endereco_compl")
	private String complemento;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "endereco_bairro")
	private String bairro;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "endereco_cidade")
	private String cidade;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "endereco_estado")
	private String estado;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name = "endereco_cep")
	private String cep;
	
	
	

	
}
