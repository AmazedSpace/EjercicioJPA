package com.en.ts.app;

import com.en.ts.entities.Banco;
import com.en.ts.entities.Cliente;

import com.en.ts.services.BancoServiceImpl;
import com.en.ts.services.ClienteServiceImpl;
import com.en.ts.services.CuentaServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		BancoServiceImpl bancoService = new BancoServiceImpl();
		ClienteServiceImpl clienteService = new ClienteServiceImpl();
		Cliente cliente = clienteService.read("1");
		Banco banco = bancoService.read(1);
		CuentaServiceImpl cuentaService = new CuentaServiceImpl();
		cuentaService.create(cliente, banco, 1294.24);
		
	}

}
