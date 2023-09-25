package org.cibertec.edu.pe.services;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IEmpleadoService;
import org.cibertec.edu.pe.interfaces.IEmpleado;
import org.cibertec.edu.pe.modelo.empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServices implements IEmpleadoService {
	@Autowired
	private IEmpleado data;
	@Override
	public List<empleado> Listado() {
		return (List<empleado>)data.findAll();
	
	}
	
	@Override
	public int grabar(empleado a) {
		int res = 0;
		empleado ObjE = data.save(a);
		if(ObjE.equals(null))res = 1;
		return res;
	}

}
