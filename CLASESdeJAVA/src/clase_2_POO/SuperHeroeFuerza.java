package clase_2_POO;

public class SuperHeroeFuerza extends Persona implements ISuperHeroeFuerza{

	public SuperHeroeFuerza(String nombre, String direccion, String edad) {
		super(nombre, direccion, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fuerza() {
		// TODO Auto-generated method stub
		System.out.println("tengo mucha fuerza");
	}

	@Override
	public void profesion() {
		// TODO Auto-generated method stub
		System.out.println("Salvo a la gente de cosas pesadas");
	}

}
