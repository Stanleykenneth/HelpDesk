package com.kenne.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kenne.helpdesk.domain.Chamado;
import com.kenne.helpdesk.domain.Cliente;
import com.kenne.helpdesk.domain.Tecnico;
import com.kenne.helpdesk.domain.enums.Perfil;
import com.kenne.helpdesk.domain.enums.Prioridade;
import com.kenne.helpdesk.domain.enums.Status;
import com.kenne.helpdesk.repositories.ChamadoRepository;
import com.kenne.helpdesk.repositories.ClienteRepository;
import com.kenne.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner{
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tec1 = new Tecnico(null, "Silvio Santos", "15226536437", "Silvio@teste.com", "12345");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Lius Hevins", "77393661454", "lius@teste.com", "54321");
		cli1.addPerfis(Perfil.CLIENTE);
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
