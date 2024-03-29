package com.kenne.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenne.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
