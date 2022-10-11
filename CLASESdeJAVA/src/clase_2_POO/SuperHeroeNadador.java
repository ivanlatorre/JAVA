package clase_2_POO;

public class SuperHeroeNadador extends Persona implements ISuperHeroeNadar{

	public SuperHeroeNadador(String nombre, String direccion, String edad) {
		super(nombre, direccion, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println("puedo nadar muy rapido y pasar horas bajo el agua");
	}

	@Override
	public void profesion() {
		// TODO Auto-generated method stub
		System.out.println("Salvo a la gente en el mar o zonas acuaticas");
	}

}
