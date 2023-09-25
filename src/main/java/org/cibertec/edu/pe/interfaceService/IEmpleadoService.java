package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.empleado;


public interface IEmpleadoService {
	public List<empleado> Listado();
	public int grabar(empleado a);
	

}
