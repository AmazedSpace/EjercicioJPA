package com.en.ts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "BANCOS")

public class Banco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true)
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "CIUDAD")
	private String ciudad;

	public Banco(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	// Constructor vacio para que funcione JPA
	public Banco() {
		
	}
	
}
