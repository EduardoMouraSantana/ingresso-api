package com.qintess.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CasaShow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String endereco;
	
	
	@Column(nullable = false)
	private int capacidade;
	
	public CasaShow() {
	}

	public CasaShow(String nome, String endereco, int capacidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.capacidade = capacidade;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	@Override
	public String toString() {
		return "CasaShow [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", capacidade=" + capacidade + "]";
	}

}
