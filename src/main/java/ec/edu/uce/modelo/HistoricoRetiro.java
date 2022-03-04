package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "historico_retiros")
public class HistoricoRetiro {

	@Id
	@Column(name = "hire_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_historico_retiros")
	@SequenceGenerator(name = "seq_historico_retiros", sequenceName = "seq_historico_retiros", allocationSize = 1)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "cuha_id")
	private CuentaHabiente cuentaHabiente;
	
	@ManyToOne
	@JoinColumn(name = "cuba_id")
	private CuentaBancaria cuentaBancaria;
	
	@Column(name = "hire_monto_retiro")
	private BigDecimal montoRetiro;
	
	@Column(name = "hire_fecha_retiro")
	private LocalDateTime fechaRetiro;
	
	// SET-GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}
	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}
	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}
	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public BigDecimal getMontoRetiro() {
		return montoRetiro;
	}
	public void setMontoRetiro(BigDecimal montoRetiro) {
		this.montoRetiro = montoRetiro;
	}
	
	@Override
	public String toString() {
		return "HistoricoRetiro [id=" + id + ", cuentaHabiente=" + cuentaHabiente + ", cuentaBancaria=" + cuentaBancaria
				+ ", montoRetiro=" + montoRetiro + ", fechaRetiro=" + fechaRetiro + "]";
	}

}
