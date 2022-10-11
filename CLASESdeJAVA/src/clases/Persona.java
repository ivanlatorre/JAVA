package clases;

import java.util.Date;

public class Persona {

	private String nombre;
	private int dni;
	private float altura;
	private Date nacimiento;
	
	//Un constructor en escencia es un metodo, pero es un metodo especial, a diferencia de los demas metodos retorna un objeto y no tiene nombre. Se utiliza para
	// la construccion de objetos.
	
	//constructor sin argumentos
	public Persona() {}
	
	//constructor con un solo argumento
	public Persona(String nombreParam) {
		this.nombre=nombreParam;
	}
	
	//constructor con todos los argumentos
	
	public Persona(String nombre, int dni, float altura, Date nacimientoParam) 
	{
		this.nombre=nombre;
		this.dni=dni;
		this.altura=altura;
		nacimiento=nacimientoParam;
	}
	
	
	/// GETES Y SETERS  : Son llamados propiedades y en escencia son metodos y funciones que nos permiten acceder a los atributos ya que estos (atributos) 
	//por naturaleza son privados e inaccesibles directamente.
	
	//Getters nos permiten como dice el nombre, obtener o traer el contenido de nuestro atributo.
	
	public int getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public Date getNacimiento() {
		return this.nacimiento;
	}
	
	//Setters, son metodos que nos permiten modificar el contenido de nuestro atributo, siempre que este no sea una constante.
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setAltura(float altura) {
		this.altura=altura;
	}
	
	public void setDni(int dni) {
		this.dni=dni;
	}

	
	//
	
	
}
