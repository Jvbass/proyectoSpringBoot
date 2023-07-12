package cl.awakelab.modulo6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrearCapacitacionController {

	@GetMapping({"crear-capacitacion"})
	public String getCrearCapacitacion(){
		return "crear-capacitacion";
	}
}
