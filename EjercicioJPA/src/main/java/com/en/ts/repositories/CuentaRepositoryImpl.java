package com.en.ts.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.en.ts.entities.Banco;
import com.en.ts.entities.Cliente;
import com.en.ts.entities.Cuenta;

@Repository(value = "CuentaRepository")
public class CuentaRepositoryImpl implements CuentaRepository {

	private EntityManagerFactory emf = null;

	public boolean create(Cliente cliente, Banco banco, Double saldo) {
		
		EntityManager em = createManagerBeginTransaction();
		
		Cuenta c = new Cuenta(cliente, banco, saldo);
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		
		return true;
		
	}

	public Cuenta read(Integer id) {
		
		EntityManager em = createManagerBeginTransaction();
		
		Cuenta cuenta = em.find(Cuenta.class, id);
		
		return cuenta;
	}

	public boolean update(Integer id, Cliente nuevoCliente, Banco nuevoBanco, Double nuevoSaldo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public CuentaRepositoryImpl() {
		emf = Persistence.createEntityManagerFactory("EjercicioJPA");
	}

	private EntityManager createManagerBeginTransaction() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		return em;
	}

}
