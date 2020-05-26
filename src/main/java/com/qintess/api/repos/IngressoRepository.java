package com.qintess.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.api.models.Ingresso;

public interface IngressoRepository extends JpaRepository<Ingresso, Integer> {

	public Ingresso findById(int id);
	
}
