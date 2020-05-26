package com.qintess.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.api.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
		
		public Cliente findBynome(String nome);
		
		public Cliente findById(int id);
	
}
