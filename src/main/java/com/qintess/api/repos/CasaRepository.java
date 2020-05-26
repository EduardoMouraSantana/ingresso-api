package com.qintess.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.api.models.CasaShow;

public interface CasaRepository extends JpaRepository<CasaShow, Integer>{

	public CasaShow findByNome(String nome);
	
	public CasaShow findById(int id);
}
