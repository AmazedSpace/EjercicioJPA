package com.en.ts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en.ts.entities.Banco;
import com.en.ts.repositories.BancoRepositoryImpl;

@Service(value = "BancoService")
public class BancoServiceImpl implements BancoService {

	@Autowired
	BancoRepositoryImpl repo;
	
	public BancoServiceImpl() {
		repo = new BancoRepositoryImpl();
	}

	public boolean create(String nombre, String ciudad) {
		return repo.create(nombre, ciudad);
	}

	public Banco read(Integer id) {
		return repo.read(id);
	}

	public boolean update(Integer id, String nuevoNombre, String nuevaCiudad) {
		return repo.update(id, nuevoNombre, nuevaCiudad);
	}

	public boolean delete(Integer id) {
		return repo.delete(id);
	}

}
