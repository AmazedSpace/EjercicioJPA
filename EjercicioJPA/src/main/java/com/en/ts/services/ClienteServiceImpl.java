package com.en.ts.services;

import com.en.ts.entities.Cliente;
import com.en.ts.repositories.ClienteRepositoryImpl;

public class ClienteServiceImpl implements ClienteService {

	ClienteRepositoryImpl repo;
	
	public ClienteServiceImpl() {
		repo = new ClienteRepositoryImpl();
	}

	public boolean create(String dni, String nombre, String direccion) {
		return repo.create(dni, nombre, direccion);
	}

	public Cliente read(String dni) {
		return repo.read(dni);
	}

	public boolean update(String dni, String nombre, String direccion) {
		return repo.update(dni, nombre, direccion);
	}

	public boolean delete(String dni) {
		return repo.delete(dni);
	}

}
