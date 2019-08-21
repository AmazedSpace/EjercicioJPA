package com.en.ts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.en.ts.entities.Cliente;
import com.en.ts.services.ClienteService;

@Controller(value = "ClienteController")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	public boolean create(String dni, String nombre, String direccion) {
		return service.create(dni, nombre, direccion);
	}

	public Cliente read(String dni) {
		return service.read(dni);
	}

	public boolean update(String dni, String nombre, String direccion) {
		return service.update(dni, nombre, direccion);
	}

	public boolean delete(String dni) {
		return service.delete(dni);
	}

}
