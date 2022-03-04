package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CuentaBancaria;
import ec.edu.uce.modelo.HistoricoRetiro;

@Service
public class GestorCajeroBancarioServiImpl implements IGestorCajeroBancarioServi {

	private static final Logger LOG = LoggerFactory.getLogger(GestorCajeroBancarioServiImpl.class);
	
	@Autowired
	private ICuentaHabienteServi cuentaHabienteServi;
	
	@Autowired
	private ICuentaBancariaServi cuentaBancariaServi;
	
	@Autowired
	private IHistoricoRetiroServi historicoRetiroServi;
	
	@Override
	public void consultarCuentas(String cedula) {
		// TODO Auto-generated method stub
		List<CuentaBancaria> misCuentas = this.cuentaHabienteServi.obtenerCuentaHabientePorCedula(cedula).getCuentaBancarias();
		for(CuentaBancaria cuentaBancaria : misCuentas) {
			LOG.info(cuentaBancaria.toString());
		}
	}

	@Override
	@Transactional
	public void retirarDinero(String numeroCuenta, BigDecimal valorRetiro) {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaBancaria = this.cuentaBancariaServi.obtenerCuentaBancariaPorNumeroDeCuenta(numeroCuenta);
		cuentaBancaria.setSaldo(cuentaBancaria.getSaldo().subtract(valorRetiro));
		
		HistoricoRetiro historicoRetiro = new HistoricoRetiro();
		historicoRetiro.setCuentaHabiente(cuentaBancaria.getCuentaHabiente());
		historicoRetiro.setCuentaBancaria(cuentaBancaria);
		historicoRetiro.setMontoRetiro(valorRetiro);
		historicoRetiro.setFechaRetiro(LocalDateTime.now());
		
		cuentaBancaria.getHistoricoRetiros().add(historicoRetiro);
		
		this.cuentaBancariaServi.actualizarCuentaBancaria(cuentaBancaria);
		this.historicoRetiroServi.insertarHistoricoRetiro(historicoRetiro);
	}

	@Override
	public void consultaSaldo(String numeroCuenta) {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaBancaria = this.cuentaBancariaServi.obtenerCuentaBancariaPorNumeroDeCuenta(numeroCuenta);
		LOG.info("Su saldo actual es de " + cuentaBancaria.getSaldo());
	}

}
