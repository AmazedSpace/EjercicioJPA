package com.en.ts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.en.ts.entities.Banco;
import com.en.ts.services.BancoService;

@Controller(value = "BancoController")
public class BancoController {
	
	@Autowired
	private BancoService service;
	
	public boolean create(String nombre, String ciudad) {
		return service.create(nombre, ciudad);
	}

	public Banco read(Integer id) {
		return service.read(id);
	}

	public boolean update(Integer id, String nuevoNombre, String nuevaCiudad) {
		return service.update(id, nuevoNombre, nuevaCiudad);
	}

	public boolean delete(Integer id) {
		return service.delete(id);
	}

}
