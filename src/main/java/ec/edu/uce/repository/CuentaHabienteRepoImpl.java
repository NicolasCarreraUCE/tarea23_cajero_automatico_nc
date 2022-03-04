package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CuentaHabiente;

@Repository
@Transactional
public class CuentaHabienteRepoImpl implements ICuentaHabienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaHabiente);
	}

	@Override
	public CuentaHabiente obtenerCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaHabiente.class, id);
	}

	@Override
	public void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaHabiente);
	}

	@Override
	public void borrarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.obtenerCuentaHabiente(id));
	}

	@Override
	public CuentaHabiente obtenerCuentaHabientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaHabiente> myQuery = this.entityManager.createQuery("SELECT c FROM CuentaHabiente c WHERE c.cedula =:cedula", CuentaHabiente.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
	}

}
