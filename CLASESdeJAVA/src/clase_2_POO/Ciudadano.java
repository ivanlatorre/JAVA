package clase_2_POO;

public class Ciudadano extends Persona{

	
	public Ciudadano(String nombre, String direccion, String edad) {
		super(nombre, direccion, edad);
		// TODO Auto-generated constructor stub
	}

	@Override  //sobre escritura
	public void profesion() {
		// TODO Auto-generated method stub
		System.out.println("Soy un ciudadano");
	}

	
	@Override
	public void saludar() {
		System.out.println("Buenas tardes");
	}
}
