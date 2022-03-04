package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.HistoricoRetiro;

@Repository
@Transactional
public class HistoricoRetiroRepoImpl implements IHistoricoRetiroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarHistoricoRetiro(HistoricoRetiro historicoRetiro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(historicoRetiro);
	}

	@Override
	public HistoricoRetiro obtenerHistoricoRetiro(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(HistoricoRetiro.class, id);
	}

	@Override
	public void actualizarHistoricoRetiro(HistoricoRetiro historicoRetiro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(historicoRetiro);
	}

	@Override
	public void borrarHistoricoRetiro(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.obtenerHistoricoRetiro(id));
	}

}
