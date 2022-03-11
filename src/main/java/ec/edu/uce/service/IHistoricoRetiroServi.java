package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.HistoricoRetiro;

public interface IHistoricoRetiroServi {
	void insertarHistoricoRetiro(HistoricoRetiro historicoRetiro);
	HistoricoRetiro obtenerHistoricoRetiro(Integer id);
	void actualizarHistoricoRetiro(HistoricoRetiro historicoRetiro);
	void borrarHistoricoRetiro(Integer id);
	
	List<HistoricoRetiro> obtenerListaDeHistoricosDeRetiro();
}
