package com.qintess.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.api.models.Ingresso;
import com.qintess.api.repos.IngressoRepository;

@Service
public class IngressoService {

	@Autowired
	private IngressoRepository ingressoRepository;

	public void insere(Ingresso ingresso) {
		ingressoRepository.save(ingresso);
	}

	public void altera(Ingresso ingresso) {
		ingressoRepository.saveAndFlush(ingresso);
	}

	public void remove(Ingresso ingresso) {
		ingressoRepository.delete(ingresso);
	}

	public Ingresso buscaPorId(int id) {
		return ingressoRepository.findById(id);
	}

	public List<Ingresso> buscaTodos() {
		return ingressoRepository.findAll();
	}
}
