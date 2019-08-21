package com.en.ts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en.ts.entities.Cliente;
import com.en.ts.repositories.ClienteRepositoryImpl;

@Service(value = "ClienteService")
public class ClienteServiceImpl implements ClienteService {

	@Autowired
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
