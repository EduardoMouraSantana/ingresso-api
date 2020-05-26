package com.qintess.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Ingresso {
	
	@Transient
	private String nome_evento;

	@Transient
	private String nome_cliente;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Evento evento;
	
	@ManyToOne
	private Cliente cliente;
	
	@Column(nullable = false)
	private String zona;

	public Ingresso() {
		
	}
	
	public Ingresso(int id, Evento evento, Cliente cliente, String zona) {
		this.id = id;
		this.evento = evento;
		this.cliente = cliente;
		this.zona = zona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public String getNome_evento() {
		return nome_evento;
	}

	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	@Override
	public String toString() {
		return "Ingresso [id=" + id + ", evento=" + evento + ", cliente=" + cliente + ", zona=" + zona + "]";
	}
	
	
	
}
