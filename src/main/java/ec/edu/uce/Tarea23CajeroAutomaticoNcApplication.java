package ec.edu.uce;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.CuentaBancaria;
import ec.edu.uce.modelo.CuentaHabiente;
import ec.edu.uce.service.ICuentaBancariaServi;
import ec.edu.uce.service.ICuentaHabienteServi;
import ec.edu.uce.service.IGestorCajeroBancarioServi;

@SpringBootApplication
public class Tarea23CajeroAutomaticoNcApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(Tarea23CajeroAutomaticoNcApplication.class);
	
	@Autowired
	private ICuentaHabienteServi cuentaHabienteServi;
	
	@Autowired
	private ICuentaBancariaServi cuentaBancariaServi;
	
	@Autowired
	private IGestorCajeroBancarioServi gestorCajeroBancarioServi;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea23CajeroAutomaticoNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// INSERTAR CUENTAS
//		// Cuenta 1
//		CuentaHabiente ch1 = new CuentaHabiente();
//		ch1.setNombre("Raul");
//		ch1.setApellido("Gisbert");
//		ch1.setCedula("1774523896");
//		
//		//this.cuentaHabienteServi.insertarCuentaHabiente(ch1);
//		
//		CuentaBancaria cb1 = new CuentaBancaria();
//		cb1.setNumeroCuenta("8777254300");
//		cb1.setSaldo(new BigDecimal("50000"));
//		cb1.setTipo("Ahorros");
//		cb1.setCuentaHabiente(ch1);
//		
//		//this.cuentaBancariaServi.insertarCuentaBancaria(cb1);
//		
//		// Cuenta 2
//		CuentaHabiente ch2 = new CuentaHabiente();
//		ch2.setNombre("Evangelina");
//		ch2.setApellido("Domingo");
//		ch2.setCedula("1701697291");
//		
//		//this.cuentaHabienteServi.insertarCuentaHabiente(ch2);
//		
//		CuentaBancaria cb2 = new CuentaBancaria();
//		cb2.setNumeroCuenta("8013714919");
//		cb2.setSaldo(new BigDecimal("80000"));
//		cb2.setTipo("Ahorros");
//		cb2.setCuentaHabiente(ch2);
//		
//		//this.cuentaBancariaServi.actualizarCuentaBancaria(cb2);
		
		// CONSULTAR CUERNTAS
//		this.gestorCajeroBancarioServi.consultarCuentas("1774523896");
//		this.gestorCajeroBancarioServi.consultarCuentas("1701697291");
		
		// HACER RETIROS
//		this.gestorCajeroBancarioServi.retirarDinero("8777254300", new BigDecimal("500"));
//		this.gestorCajeroBancarioServi.retirarDinero("8013714919", new BigDecimal("500"));
//		
//		this.gestorCajeroBancarioServi.retirarDinero("8777254300", new BigDecimal("800"));
//		this.gestorCajeroBancarioServi.retirarDinero("8013714919", new BigDecimal("1500"));
		
		// CONSULTAR SALDO
		this.gestorCajeroBancarioServi.consultaSaldo("8777254300");
		this.gestorCajeroBancarioServi.consultaSaldo("8013714919");
		
	}

}
