package ec.edu.uce.service;

import java.math.BigDecimal;

public interface IGestorCajeroBancarioServi {
	void consultarCuentas(String cedula);
	void retirarDinero(String numeroCuenta, BigDecimal valorRetiro);
	void consultaSaldo(String numeroCuenta);
}
