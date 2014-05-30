package ar.com.bamba.entidad;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Sensor {

	//atributos
	private Long id;
	private String name;
	private String descripcion;
	private int conector;
	private boolean activo;
	
	
	
	public Sensor() {
		super();
	}


	//constructor using fields
	public Sensor(Long id) {
		super();
		this.id = id;
		this.name = "Monoxido";
		this.descripcion = "Monoxido A2G10";
		this.conector = 12;
		this.activo = true;
	}
	
	
	//getters y setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getConector() {
		return conector;
	}
	public void setConector(int conector) {
		this.conector = conector;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
