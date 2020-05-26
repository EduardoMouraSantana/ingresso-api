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

import com.qintess.api.models.CasaShow;
import com.qintess.api.services.CasaService;

@RestController
@RequestMapping("/casa")
public class CasaController {

	@Autowired
	private CasaService casaService;

	@GetMapping("")
	public List<CasaShow> carrega() {
		return casaService.buscaTodos();
	}

	@PostMapping("/salva")
	public void salva(@RequestBody CasaShow casa) {
		casaService.insere(casa);
		System.out.println("Casa cadastrada com sucesso");
	}

	@DeleteMapping("/deleta")
	public void deleta(@RequestBody CasaShow casa) {
		if (casa == null) {
			System.out.println("Casa não existe");
		} else {
			casaService.remove(casa);
			System.out.println("Casa deletada com sucesso");
		}
	}

	@PatchMapping("/altera")
	public void carregaAlterar(@RequestBody CasaShow casa) {
		if (casa == null) {
			System.out.println("Casa não existe");
		} else {
			casaService.altera(casa);
			System.out.println("Casa alterada com sucesso");
		}
	}
}
