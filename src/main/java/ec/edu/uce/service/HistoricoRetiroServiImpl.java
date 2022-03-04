package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.HistoricoRetiro;
import ec.edu.uce.repository.IHistoricoRetiroRepo;

@Service
public class HistoricoRetiroServiImpl implements IHistoricoRetiroServi {

	@Autowired
	private IHistoricoRetiroRepo historicoRetiroRepo;
	
	@Override
	public void insertarHistoricoRetiro(HistoricoRetiro historicoRetiro) {
		// TODO Auto-generated method stub
		this.historicoRetiroRepo.insertarHistoricoRetiro(historicoRetiro);
	}

	@Override
	public HistoricoRetiro obtenerHistoricoRetiro(Integer id) {
		// TODO Auto-generated method stub
		return this.historicoRetiroRepo.obtenerHistoricoRetiro(id);
	}

	@Override
	public void actualizarHistoricoRetiro(HistoricoRetiro historicoRetiro) {
		// TODO Auto-generated method stub
		this.historicoRetiroRepo.actualizarHistoricoRetiro(historicoRetiro);
	}

	@Override
	public void borrarHistoricoRetiro(Integer id) {
		// TODO Auto-generated method stub
		this.historicoRetiroRepo.borrarHistoricoRetiro(id);
	}

}
