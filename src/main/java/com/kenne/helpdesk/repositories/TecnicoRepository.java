package com.kenne.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenne.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
