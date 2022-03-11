package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CuentaBancaria;
import ec.edu.uce.modelo.CuentaHabeinteVIP;
import ec.edu.uce.modelo.CuentaHabiente;
import ec.edu.uce.modelo.HistoricoRetiro;

@Service
public class GestorReportesServiImpl implements IGestorReportesServi {

	private static final Logger LOG = LoggerFactory.getLogger(GestorReportesServiImpl.class);

	@Autowired
	private ICuentaBancariaServi cuentaBancariaServi;
	
	@Autowired
	private IHistoricoRetiroServi historicoRetiroServi;
	
	@Override
	public void reporteCuentaHabiente(BigDecimal saldo) {
		// TODO Auto-generated method stub
		List<CuentaBancaria> cb = this.cuentaBancariaServi.obtenerListaDeCuentasBancarias();
		cb.stream().filter(c -> c.getSaldo().compareTo(saldo) >= 0).map(c -> {
			CuentaHabeinteVIP cuenta = new CuentaHabeinteVIP();
			CuentaHabiente ch = c.getCuentaHabiente();
			cuenta.setCedula(ch.getCedula());
			cuenta.setNombre(ch.getNombre());
			cuenta.setApellido(ch.getApellido());
			cuenta.setNumeroCuenta(c.getNumeroCuenta());
			cuenta.setTipo(c.getTipo());
			cuenta.setSaldo(c.getSaldo());
			return cuenta;
		}).forEach(c -> LOG.info(c.toString()));
	}
	
	
	@Override
	public void reporteHistoricoRetiros(LocalDateTime fechaRetiro, BigDecimal montoRetiro) {
		// TODO Auto-generated method stub
		List<HistoricoRetiro> hr = this.historicoRetiroServi.obtenerListaDeHistoricosDeRetiro();
		hr.stream().filter(h -> h.getFechaRetiro().isBefore(fechaRetiro) && h.getMontoRetiro().compareTo(montoRetiro) <= 0)
		.forEach(h->LOG.info("[" + h.getCuentaHabiente().getCedula() + "]-[" + h.getCuentaHabiente().getNombre() +"]-[" + h.getCuentaHabiente().getApellido() + "]-[" + h.getMontoRetiro() + "]-[" + h.getFechaRetiro() + "]"));
	}

}
