package ec.edu.uce.service;

import ec.edu.uce.modelo.CuentaBancaria;

public interface ICuentaBancariaServi {
	void insertarCuentaBancaria(CuentaBancaria cuentaBancaria);
	CuentaBancaria obtenerCuentaBancaria(Integer id);
	void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria);
	void borrarCuentaBancaria(Integer id);
	
	CuentaBancaria obtenerCuentaBancariaPorNumeroDeCuenta(String numeroCuenta);
}
