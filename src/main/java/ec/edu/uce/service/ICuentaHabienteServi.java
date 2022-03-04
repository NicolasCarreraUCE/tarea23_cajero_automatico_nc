package ec.edu.uce.service;

import ec.edu.uce.modelo.CuentaHabiente;

public interface ICuentaHabienteServi {
	void insertarCuentaHabiente(CuentaHabiente cuentaHabiente);
	CuentaHabiente obtenerCuentaHabiente(Integer id);
	void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente);
	void borrarCuentaHabiente(Integer id);

	CuentaHabiente obtenerCuentaHabientePorCedula(String cedula);
}
