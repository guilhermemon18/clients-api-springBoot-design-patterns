package com.exemplo.padroes_projeto_spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.padroes_projeto_spring.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}