package ec.edu.uce.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CuentaBancaria;
import ec.edu.uce.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiImpl implements ICuentaBancariaServi {

	@Autowired
	private ICuentaBancariaRepo cuentaBancariaRepo;
	
	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.insertarCuentaBancaria(cuentaBancaria);
	}

	@Override
	public CuentaBancaria obtenerCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.obtenerCuentaBancaria(id);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaBancaria);
	}

	@Override
	public void borrarCuentaBancaria(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.borrarCuentaBancaria(id);
	}

	@Override
	public CuentaBancaria obtenerCuentaBancariaPorNumeroDeCuenta(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.obtenerCuentaBancariaPorNumeroDeCuenta(numeroCuenta);
	}

	@Override
	public List<CuentaBancaria> obtenerListaDeCuentasBancarias() {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.obtenerListaDeCuentasBancarias();
	}
 
}
