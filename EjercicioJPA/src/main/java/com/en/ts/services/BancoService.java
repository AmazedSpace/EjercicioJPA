package com.en.ts.services;

import com.en.ts.entities.Banco;

public interface BancoService {
	
	public boolean create(String nombre, String ciudad);
	
	public Banco read(Integer id);
	
	public boolean update(Integer id, String nuevoNombre, String nuevaCiudad);
	
	public boolean delete(Integer id);

}
