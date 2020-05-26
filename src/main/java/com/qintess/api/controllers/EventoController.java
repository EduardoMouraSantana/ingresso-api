package com.qintess.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.api.models.Evento;
import com.qintess.api.services.CasaService;
import com.qintess.api.services.EventoService;;

@RestController
@RequestMapping("/evento")
public class EventoController {

	@Autowired
	private EventoService eventoService;

	@Autowired
	private CasaService casaService;

	@GetMapping("")
	public List<Evento> carrega() {
		return eventoService.buscaTodos();
	}

	@PostMapping("/salva")
	public void salva(@RequestBody Evento evento) {
		evento.setCasa_show(casaService.buscaPorNome(evento.getNome_casa()));
		eventoService.insere(evento);
		System.out.println("Evento cadastrado com sucesso");
	}

	@DeleteMapping("/deleta")
	public void deleta(@RequestBody Evento evento) {
		if (evento == null) {
			System.out.println("Evento não existe");
		} else {
			eventoService.remove(evento);
			System.out.println("Evento deletado com sucesso");
		}
	}

	@PatchMapping("/altera")
	public void carregaAlterar(@RequestBody Evento evento) {
		if (evento == null) {
			System.out.println("Evento não existe");
		} else {
			eventoService.altera(evento);
			System.out.println("Evento alterado com sucesso");
		}
	}

}
