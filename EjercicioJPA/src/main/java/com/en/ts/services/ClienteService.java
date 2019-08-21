package com.en.ts.services;

import com.en.ts.entities.Cliente;

public interface ClienteService {

	public boolean create(String dni, String nombre, String direccion);
	
	public Cliente read(String dni);
	
	public boolean update(String dni, String nombre, String direccion);
	
	public boolean delete(String dni);
	
}
