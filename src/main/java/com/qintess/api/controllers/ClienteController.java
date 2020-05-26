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

import com.qintess.api.models.Cliente;
import com.qintess.api.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("")
	private List<Cliente> carrega() {
		return clienteService.buscaTodos();
	}

	@PostMapping("/salva")
	public void salva(@RequestBody Cliente cliente) {
		clienteService.insere(cliente);
		System.out.println("Cliente cadastrado com sucesso");
	}

	@DeleteMapping("/deleta")
	public void deleta(@RequestBody Cliente cliente) {
		if (cliente == null) {
			System.out.println("Cliente não existe");
		} else {
			clienteService.remove(cliente);
			System.out.println("Cliente deletado com sucesso");
		}
	}

	@PatchMapping("/altera")
	public void carregaAlterar(@RequestBody Cliente cliente) {
		if (cliente == null) {
			System.out.println("Cliente não existe");
		} else {
			clienteService.altera(cliente);
			System.out.println("Cliente alterado com sucesso");
		}
	}
}
