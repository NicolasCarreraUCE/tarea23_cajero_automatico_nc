package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorReportesServi {

	void reporteCuentaHabiente(BigDecimal saldo);
	void reporteHistoricoRetiros(LocalDateTime fechaRetiro, BigDecimal montoRetiro);
	
}
