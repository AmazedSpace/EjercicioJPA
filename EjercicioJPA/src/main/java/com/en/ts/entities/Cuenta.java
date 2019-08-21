package com.en.ts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "CUENTAS")

public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dni", referencedColumnName = "DNI")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idbanco", referencedColumnName = "ID")
	private Banco banco;
	
	@Column
	private Double saldo;

	public Cuenta(Cliente cliente, Banco banco, Double saldo) {
		this.cliente = cliente;
		this.banco = banco;
		this.saldo = saldo;
	}

	// Constructor vacio para que funcione JPA
	public Cuenta() {
		
	}
	
}
