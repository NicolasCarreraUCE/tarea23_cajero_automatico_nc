package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class CuentaHabeinteVIP {

	private String nombre;
	
	private String apellido;
	
	private String cedula;
	
	private String numeroCuenta;
	
	private BigDecimal saldo;
	
	private String tipo;

	// SET-GET
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "[" + cedula +"]-[" + nombre + "]-[" + apellido + "]-[" + numeroCuenta + "]-[" + tipo + "]-[" + saldo + "]";
	}

}
