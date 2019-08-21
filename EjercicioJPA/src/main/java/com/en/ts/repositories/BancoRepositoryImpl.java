package com.en.ts.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.en.ts.entities.Banco;

public class BancoRepositoryImpl implements BancoRepository {

	private EntityManagerFactory emf = null;
	
	public boolean create(String nombre, String ciudad) {
		
		EntityManager em = createManagerBeginTransaction();
		
		Banco b = new Banco(nombre, ciudad);
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		
		return true;
		
	}

	public Banco read(Integer id) {

		EntityManager em = createManagerBeginTransaction();
		
		Banco banco = em.find(Banco.class, id);
		
		return banco;
		
	}

	public boolean update(Integer id, String nuevoNombre, String nuevaCiudad) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public BancoRepositoryImpl() {
		emf = Persistence.createEntityManagerFactory("EjercicioJPA");
	}
	
	private EntityManager createManagerBeginTransaction() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		return em;
	}

}
