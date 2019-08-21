package com.en.ts.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.en.ts.entities.Cliente;

@Repository(value = "ClienteRepository")
public class ClienteRepositoryImpl implements ClienteRepository {

	private EntityManagerFactory emf = null;

	public boolean create(String dni, String nombre, String direccion) {
		
		EntityManager em = createManagerBeginTransaction();
		
		Cliente c = new Cliente(dni, nombre, direccion);
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	public Cliente read(String dni) {
		
		EntityManager em = createManagerBeginTransaction();
		
		Cliente cliente = em.find(Cliente.class, dni);
		
		return cliente;
	}

	public boolean update(String dni, String nombre, String direccion) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(String dni) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public ClienteRepositoryImpl() {
		emf = Persistence.createEntityManagerFactory("EjercicioJPA");
	}
	
	private EntityManager createManagerBeginTransaction() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		return em;
	}
	
}
