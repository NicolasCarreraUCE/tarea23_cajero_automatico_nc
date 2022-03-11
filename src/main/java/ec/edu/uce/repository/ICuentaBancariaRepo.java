package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
	void insertarCuentaBancaria(CuentaBancaria cuentaBancaria);
	CuentaBancaria obtenerCuentaBancaria(Integer id);
	void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria);
	void borrarCuentaBancaria(Integer id);
	
	CuentaBancaria obtenerCuentaBancariaPorNumeroDeCuenta(String numeroCuenta);
	
	List<CuentaBancaria> obtenerListaDeCuentasBancarias();
}
