package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadoService;
import org.cibertec.edu.pe.modelo.empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {
	@Autowired
	private IEmpleadoService servicio;
	
	// Método para listar
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<empleado> LEmpleado = servicio.Listado();
		m.addAttribute("listEmpl", LEmpleado);
		return "index";
	}
	
	//Metodo para Agregar
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("empleado", new empleado());
		return "form";
	}
	
	
	//Metodo para Agregar
	@GetMapping("/salvar")
	public String salvar(@Validated empleado a,Model m) {
		servicio.grabar(a);
		return "redirect:/listar";
	}
	
}
