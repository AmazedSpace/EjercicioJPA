package com.en.ts.services;

import com.en.ts.entities.Banco;
import com.en.ts.entities.Cliente;
import com.en.ts.entities.Cuenta;
import com.en.ts.repositories.CuentaRepositoryImpl;

public class CuentaServiceImpl implements CuentaService {
	
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
