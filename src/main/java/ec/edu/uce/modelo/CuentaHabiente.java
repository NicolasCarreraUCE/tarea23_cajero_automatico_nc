package ec.edu.uce.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_habiente")
public class CuentaHabiente {
	
	@Id
	@Column(name = "cuha_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuenta_habiente")
	@SequenceGenerator(name = "seq_cuenta_habiente", sequenceName = "seq_cuenta_habiente", allocationSize = 1)
	private Integer id;
	
	@Column(name = "cuha_nombre")
	private String nombre;
	
	@Column(name = "cuha_apellido")
	private String apellido;
	
	@Column(name = "cuha_cedula")
	private String cedula;
	
	@OneToMany(mappedBy = "cuentaHabiente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CuentaBancaria> cuentaBancarias;
	
	@OneToMany(mappedBy = "cuentaHabiente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<HistoricoRetiro> historicoRetiros;
	
	// SET-GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	public List<CuentaBancaria> getCuentaBancarias() {
		return cuentaBancarias;
	}
	public void setCuentaBancarias(List<CuentaBancaria> cuentaBancarias) {
		this.cuentaBancarias = cuentaBancarias;
	}
	public List<HistoricoRetiro> getHistoricoRetiros() {
		return historicoRetiros;
	}
	public void setHistoricoRetiros(List<HistoricoRetiro> historicoRetiros) {
		this.historicoRetiros = historicoRetiros;
	}
	
	@Override
	public String toString() {
		return "CuentaHabiente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ "]";
	}
}
