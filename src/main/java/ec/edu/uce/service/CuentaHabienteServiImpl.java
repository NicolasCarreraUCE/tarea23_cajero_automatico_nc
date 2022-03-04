package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CuentaHabiente;
import ec.edu.uce.repository.ICuentaHabienteRepo;

@Service
public class CuentaHabienteServiImpl implements ICuentaHabienteServi {

	@Autowired
	private ICuentaHabienteRepo cuentaHabienteRepo;
	
	@Override
	public void insertarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.cuentaHabienteRepo.insertarCuentaHabiente(cuentaHabiente);
	}

	@Override
	public CuentaHabiente obtenerCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaHabienteRepo.obtenerCuentaHabiente(id);
	}

	@Override
	public void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.cuentaHabienteRepo.actualizarCuentaHabiente(cuentaHabiente);
	}

	@Override
	public void borrarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaHabienteRepo.borrarCuentaHabiente(id);
	}

	@Override
	public CuentaHabiente obtenerCuentaHabientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.cuentaHabienteRepo.obtenerCuentaHabientePorCedula(cedula);
	}

}
