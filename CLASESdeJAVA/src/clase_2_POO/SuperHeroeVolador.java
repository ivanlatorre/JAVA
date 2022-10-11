package clase_2_POO;

public class SuperHeroeVolador extends Persona implements ISuperHeroeVolador, ISuperHeroeFuerza{

	public SuperHeroeVolador(String nombre, String direccion, String edad) {
		super(nombre, direccion, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void profesion() {
		// TODO Auto-generated method stub
		System.out.println("Salvo al agente de lugares altos y puedo levantar autos");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Puedo volar");
	}

	@Override
	public void fuerza() {
		// TODO Auto-generated method stub
		System.out.println("Tengo mucha fuerza = "+PI);
	}

}
