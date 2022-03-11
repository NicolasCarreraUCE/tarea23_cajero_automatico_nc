package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.HistoricoRetiro;

public interface IHistoricoRetiroRepo {
	void insertarHistoricoRetiro(HistoricoRetiro historicoRetiro);
	HistoricoRetiro obtenerHistoricoRetiro(Integer id);
	void actualizarHistoricoRetiro(HistoricoRetiro historicoRetiro);
	void borrarHistoricoRetiro(Integer id);
	
	List<HistoricoRetiro> obtenerListaDeHistoricosDeRetiro();
}
