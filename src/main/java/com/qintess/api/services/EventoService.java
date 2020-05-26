package com.qintess.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.api.repos.EventoRepository;
import com.qintess.api.models.Evento;

@Service
public class EventoService {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	public void insere(Evento evento) {
		eventoRepository.save(evento);
	}
	
	public void altera(Evento evento) {
		eventoRepository.saveAndFlush(evento);
	}
	
	public void remove(Evento evento) {
		eventoRepository.delete(evento);
	}
	
	public Evento buscaPorId(int id) {
		return eventoRepository.findById(id);
	}
	
	public Evento buscaPorNome(String nome) {
		return eventoRepository.findBynome(nome);
	}
	
	public List<Evento> buscaTodos(){
		return eventoRepository.findAll();
	}
}
