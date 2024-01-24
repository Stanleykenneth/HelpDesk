package com.kenne.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenne.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
