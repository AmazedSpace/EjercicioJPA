package com.en.ts.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.en.ts.Config;
import com.en.ts.controllers.BancoController;
import com.en.ts.controllers.ClienteController;
import com.en.ts.controllers.CuentaController;
import com.en.ts.entities.Banco;
import com.en.ts.entities.Cliente;
import com.en.ts.services.BancoServiceImpl;
import com.en.ts.services.ClienteServiceImpl;
import com.en.ts.services.CuentaServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		/*BancoServiceImpl bancoService = new BancoServiceImpl();
		ClienteServiceImpl clienteService = new ClienteServiceImpl();
		Cliente cliente = clienteService.read("1");
		Banco banco = bancoService.read(1);
		CuentaServiceImpl cuentaService = new CuentaServiceImpl();
		cuentaService.create(cliente, banco, 1294.24);*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		BancoController bancoController = context.getBean("BancoController", BancoController.class);
		ClienteController clienteController = context.getBean("ClienteController", ClienteController.class);
		CuentaController cuentaController = context.getBean("CuentaController", CuentaController.class);
		
		System.out.println(bancoController.create("SANTANTDER", "CANTABRIA"));
		System.out.println(clienteController.create("3", "FRANCISCA", "Calle Los Arbustos"));
		System.out.println(cuentaController.create(clienteController.read("3"), bancoController.read(2), 309.34));
		
	}

}
