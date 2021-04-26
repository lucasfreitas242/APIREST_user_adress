package com.pessoa.endereco.controleenderecos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoa.endereco.controleenderecos.entity.EnderecoEntity;

@Repository
public interface IEnderecoRepository extends JpaRepository<EnderecoEntity, Long> {

}
