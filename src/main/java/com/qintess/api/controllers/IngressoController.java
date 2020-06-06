package com.qintess.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.api.models.Ingresso;
import com.qintess.api.services.ClienteService;
import com.qintess.api.services.EventoService;
import com.qintess.api.services.IngressoService;

@RestController
@CrossOrigin
@RequestMapping("/ingresso")
public class IngressoController {

	@Autowired
	private IngressoService ingressoService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private EventoService eventoService;

	@GetMapping("")
	public List<Ingresso> carrega() {
		return ingressoService.buscaTodos();
	}

	@PostMapping("/salva")
	public void salva(@RequestBody Ingresso ingresso) {
		ingresso.setEvento(eventoService.buscaPorNome(ingresso.getNome_evento()));
		ingresso.setCliente(clienteService.buscaPorNome(ingresso.getNome_cliente()));
		ingressoService.insere(ingresso);
		System.out.println("Ingresso cadastrado com sucesso");
	}

}
