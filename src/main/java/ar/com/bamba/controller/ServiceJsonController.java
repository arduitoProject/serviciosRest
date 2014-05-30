package ar.com.bamba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.bamba.entidad.Sensor;


@RestController
@RequestMapping("/sensores")
public class ServiceJsonController {
		
	
	/**
	 * Devuelve un JSON con un listado de sensores
	 */
	@RequestMapping(value="/json", produces = "application/json")
	public List<Sensor> getSensorAsJson(){
		
		ArrayList<Sensor> listaSensores = new ArrayList<Sensor>();
		Sensor sensor1 = new Sensor(Long.valueOf(1020));
		Sensor sensor2 = new Sensor(Long.valueOf(1021));
		Sensor sensor3 = new Sensor(Long.valueOf(1022));
		Sensor sensor4 = new Sensor(Long.valueOf(1023));
		Sensor sensor5 = new Sensor(Long.valueOf(1024));

		listaSensores.add(sensor1);
		listaSensores.add(sensor2);
		listaSensores.add(sensor3);
		listaSensores.add(sensor4);
		listaSensores.add(sensor5);
		
		return listaSensores;
	}
	
	
	/**
	 * Devuelve un xml con los datos de un sensor
	 */
	@RequestMapping(value = "/xml", produces = "application/xml")
	public Sensor getSensorAsXml() {
		
		return new Sensor(Long.valueOf(1022));
	}
	
	

}
