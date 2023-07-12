package cl.awakelab.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListarCapacitacionController {

	@GetMapping({"listar-capacitaciones"})
	public String getCrearCapacitacion(){
		return "listar-capacitaciones";
	}
}
