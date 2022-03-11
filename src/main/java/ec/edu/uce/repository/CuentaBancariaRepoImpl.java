package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import aj.org.objectweb.asm.Type;
import ec.edu.uce.modelo.CuentaBancaria;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public CuentaBancaria obtenerCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public void borrarCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.obtenerCuentaBancaria(id));
	}

	@Override
	public CuentaBancaria obtenerCuentaBancariaPorNumeroDeCuenta(String numeroCuenta) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaBancaria> myQuery = this.entityManager.createQuery("SELECT c FROM CuentaBancaria c WHERE c.saldo >=:numCuenta", CuentaBancaria.class);
		myQuery.setParameter("numCuenta", numeroCuenta);
		return myQuery.getSingleResult();
	}

	@Override
	public List<CuentaBancaria> obtenerListaDeCuentasBancarias() {
		// TODO Auto-generated method stub
		TypedQuery<CuentaBancaria> myQuery = this.entityManager.createQuery("SELECT c FROM CuentaBancaria c", CuentaBancaria.class);
		return myQuery.getResultList();
	}
 
}
