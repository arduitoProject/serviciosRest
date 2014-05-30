package ar.com.bamba.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller bien sencillos.
 * @author ptamburro
 */

@RestController
@RequestMapping("/sensores")
public class SimpleServiceController {

	@RequestMapping(value="/activar/{nroSensor}")
	public String getInfoActivarSensor(@PathVariable("nroSensor") Long nroSensor){
	
		String respuesta = "Activando sensor nro: " + nroSensor;
		return respuesta;
	}
	
}
