package clases;

import java.util.Date;

public class Empleado extends Persona{  //Con la palabra extends le indicamos a una clase de cual otra debe heredar sus atributos y comportamiento
										// en este caso la clase Empleado va a heredar de Persona
	private String role;
	private String nroLegajo;
	private Date ingreso;
	private Empleado jefeDirecto;
	
	//constructor
	public Empleado () {
		
	}
	
	public Empleado(String nombre, String role, String nroLegajo, Date ingreso, Empleado jefe) {
		super(nombre, 14, 13.5f, new Date());
		this.role=role;
		this.nroLegajo=nroLegajo;
		this.ingreso=ingreso;
		this.jefeDirecto=jefe;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(String nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	public Date getIngreso() {
		return ingreso;
	}

	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}

	public Empleado getJefeDirecto() {
		return jefeDirecto;
	}

	public void setJefeDirecto(Empleado jefeDirecto) {
		this.jefeDirecto = jefeDirecto;
	}	
	
	
}
