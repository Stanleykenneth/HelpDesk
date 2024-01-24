package com.kenne.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenne.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
