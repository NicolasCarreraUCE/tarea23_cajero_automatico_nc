package ec.edu.uce.repository;

import ec.edu.uce.modelo.CuentaHabiente;

public interface ICuentaHabienteRepo {
	void insertarCuentaHabiente(CuentaHabiente cuentaHabiente);
	CuentaHabiente obtenerCuentaHabiente(Integer id);
	void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente);
	void borrarCuentaHabiente(Integer id);
	
	CuentaHabiente obtenerCuentaHabientePorCedula(String cedula);
}
