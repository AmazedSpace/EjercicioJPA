package com.en.ts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.en.ts.entities.Banco;
import com.en.ts.entities.Cliente;
import com.en.ts.entities.Cuenta;
import com.en.ts.services.CuentaService;

@Controller(value = "CuentaController")
public class CuentaController {
	
	@Autowired
	private CuentaService service;
	
	public boolean create(Cliente cliente, Banco banco, Double saldo) {
		return service.create(cliente, banco, saldo);
	}

	public Cuenta read(Integer id) {
		return service.read(id);
	}

	public boolean update(Integer id, Cliente nuevoCliente, Banco nuevoBanco, Double nuevoSaldo) {
		return service.update(id, nuevoCliente, nuevoBanco, nuevoSaldo);
	}

	public boolean delete(Integer id) {
		return service.delete(id);
	}

}
