package com.qintess.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.api.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer>{
	
		public Evento findBynome(String nome);
		
		public Evento findById(int id);
}
