package com.qintess.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.api.repos.CasaRepository;
import com.qintess.api.models.CasaShow;

@Service
public class CasaService {
	
	@Autowired
	private CasaRepository casaRepository;
	
	public void insere(CasaShow casa) {
		casaRepository.save(casa);
	}
	
	public void altera(CasaShow casa) {
		casaRepository.saveAndFlush(casa);
	}
	
	public void remove(CasaShow casa) {
		casaRepository.delete(casa);
	}
	
	public CasaShow buscaPorId(int id) {
		return casaRepository.findById(id);
	}
	
	public CasaShow buscaPorNome(String nome) {
		return casaRepository.findByNome(nome);
	}
	
	public List<CasaShow> buscaTodos(){
		return casaRepository.findAll();
	}
}
