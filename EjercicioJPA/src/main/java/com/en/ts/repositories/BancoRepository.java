package com.en.ts.repositories;

import com.en.ts.entities.Banco;

public interface BancoRepository {
	
	public boolean create(String nombre, String ciudad);
	
	public Banco read(Integer id);
	
	public boolean update(Integer id, String nuevoNombre, String nuevaCiudad);
	
	public boolean delete(Integer id);

}
