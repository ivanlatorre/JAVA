package clase_2_POO;

public abstract class Persona {

	private String nombre;
	private String direccion;
	private String edad;
		
	public Persona(String nombre, String direccion, String edad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	public void saludar() {
		System.out.println("Hola buenos días");
	}
	
	public abstract void profesion();
}
