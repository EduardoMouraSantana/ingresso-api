package com.qintess.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.api.repos.ClienteRepository;
import com.qintess.api.models.Cliente;

@Service
public class ClienteService {

		@Autowired
		private ClienteRepository clienteRepository;
		
		public void insere(Cliente cliente) {
			clienteRepository.save(cliente);
		}
		
		public void altera(Cliente cliente) {
			clienteRepository.saveAndFlush(cliente);
		}
		
		public void remove(Cliente cliente) {
			clienteRepository.delete(cliente);
		}
		
		public Cliente buscaPorId(int id) {
			return clienteRepository.findById(id);
		}
		
		public Cliente buscaPorNome(String nome) {
			return clienteRepository.findBynome(nome);
		}
		
		public List<Cliente> buscaTodos(){
			return clienteRepository.findAll();		
		}
}
