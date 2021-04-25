package com.pessoa.endereco.controleenderecos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoa.endereco.controleenderecos.entity.PessoaEntity;

@Repository
public interface IPessoarepository extends JpaRepository<PessoaEntity, Long> {

}
