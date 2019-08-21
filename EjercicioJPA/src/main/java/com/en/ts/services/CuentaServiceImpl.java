package com.en.ts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en.ts.entities.Banco;
import com.en.ts.entities.Cliente;
import com.en.ts.entities.Cuenta;
import com.en.ts.repositories.CuentaRepositoryImpl;

@Service(value = "CuentaService")
public class CuentaServiceImpl implements CuentaService {
	
	@Autowired
	CuentaRepositoryImpl repo;

	public CuentaServiceImpl() {
		repo = new CuentaRepositoryImpl();
	}

	public boolean create(Cliente cliente, Banco banco, Double saldo) {
		return repo.create(cliente, banco, saldo);
	}

	public Cuenta read(Integer id) {
		return repo.read(id);
	}

	public boolean update(Integer id, Cliente nuevoCliente, Banco nuevoBanco, Double nuevoSaldo) {
		return repo.update(id, nuevoCliente, nuevoBanco, nuevoSaldo);
	}

	public boolean delete(Integer id) {
		return repo.delete(id);
	}

}
