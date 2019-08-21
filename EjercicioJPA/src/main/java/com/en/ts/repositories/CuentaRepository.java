package com.en.ts.repositories;

import com.en.ts.entities.Banco;
import com.en.ts.entities.Cliente;
import com.en.ts.entities.Cuenta;

public interface CuentaRepository {
	
	public boolean create(Cliente cliente, Banco banco, Double saldo);
	
	public Cuenta read(Integer id);
	
	public boolean update(Integer id, Cliente nuevoCliente, Banco nuevoBanco, Double nuevoSaldo);
	
	public boolean delete(Integer id);

}
