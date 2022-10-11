package clase_1_POO;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import clases.Cliente;
import clases.Contenedor;
import clases.Contenido;
import clases.Empleado;
import clases.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO tipo de dato que comienze con MAYUSCULA es un objeto y las que no son llamadas del tipo primitivo.
		
		/////////////////////////////////////////////// CLASE 1//////////////////////////////////////////////////////////////
		
		//constantes
		final double PI =3.14;
		final String NOMBRE_DEL_DIA="Lunes";
		final boolean FALSO = false;
		
		//variables primitivas numericas enteras
		byte numeroMuyPequePositivo= 127;   //Es un número entero de 8 bits complemento a dos. Su valor mínimo es -128 y el máximo es 127.
		byte numeroMuyPequeNegativo=-128;
		
		short numeroPequePositivo= 32767;  //Es un entero de 16 bits complemento  a dos. Su valor mínimo es -32768 y el máximo es 32767. 
		short numeroPequeNegativo= -32768;
		
		int numeroMedianoPositivo = 2_147_483_647;  // Es un entero de 32 bits complemento a 2. Su valor mínimo es -2.147.483.648 y el máximo es 2.147.483.647. Es la elección predeterminada para valores enteros a no ser que haya una razón para escoger alguno diferente.
		int numeroMedianoNegativo = -2_147_483_648;
		int numeroMedianoConOtraMneraDeEscribir =-2147483648;
		
		long numeroGrandePositivo; //El tipo de dato long es un entero de 64 bits complemento a dos. Su valor mínimo es -9.223.372.036.854.775.808 y el máximo es 9.223.372.036.854.775.807. Utilizar este tipo de dato cuando necesite un rango de valores más amplio que el proporcionado por int. 
		numeroGrandePositivo= 9_223_372_036_854_775_807L;	
		
		long numeroGrandeNegativo = -9_223_372_036854775808L; //Se puede convinar guiones bajo para separar una parte del numero visualmente;
		
		////// Es utiliza al string para representar un numero muy muy muy pero muy demasiado grande.
		
		BigInteger unNumeroRealmenteMuyGrande = new BigInteger("821938901283908190238903218903128093278123789123789123798");
		//System.out.println("Este es un numero realmente grande: "+unNumeroRealmenteMuyGrande.subtract(new BigInteger("1")));
		
		
	
		//variables primitivas con decimales o punto flotane		
		
		float numeroConComa = 3.40282346638528860e+38f;  //Es un dato en coma flotante IEEE 754 de 32 bits y precisión simple.
		
		double numeroConComaConDoblePresicion = 3.40282346638528860e+64;//Es un dato en coma flotante IEEE 754 de 64 bits y precisión doble.
		
		//variables primitivas booleanas
		
		boolean falso = false;
		
		boolean verdad= true;
		
		// variales primitivas de 1 caracter
		
		char caracter ='a';
		//char notACaracter ="a";
		
		//Objeto String, es un arreglo de caracteres, tambien conocido como string o cadena de caracteres o solamente una cadena
		
		String cadenDeCaracteres = "hola, esta es nuestra primer clase";
		
		
		// Inferencia de tipos usando var apartir de java 11
		
		var estoEsUnString = "soy un string";		
		
		var estoEsUnInt = 1;
		
		var soyUnEnteroLargo = 1L;
		
		
		Persona persona1 = new Persona("Nestor");
		
		String nombre= persona1.getNombre();
		
		System.out.println("nombre: "+nombre);
		
		persona1.setNombre("Matias");
		
		Persona persona2 = persona1;
		
		
		System.out.println("persona: "+persona1);
		System.out.println("persona2: "+persona2);
		
		persona2 = new Persona("JAVA");
		System.out.println("persona2: "+persona2);

		System.out.println("hash: "+persona1.hashCode());
		nombre = persona1.getNombre();
		System.out.println("nombre: "+nombre);

		
		var numero1 = 1;
		var numero2 = 32768;
		
		System.out.println(((Object)numero1).getClass().getSimpleName());
		System.out.println(((Object)numero2).getClass().getSimpleName());
		
		/////////////////////////////////////////////// CLASE 2 //////////////////////////////////////////////////////////////

		Empleado vendedor = new Empleado();
		vendedor.setAltura(1.7f);
		vendedor.setDni(1234566);
		vendedor.setNombre("pepe");
		
		Empleado jefeDeVentas = new Empleado();
		jefeDeVentas.setAltura(1.8f);
		jefeDeVentas.setDni(963852);
		jefeDeVentas.setNombre("Marcos");
		
		vendedor.setJefeDirecto(jefeDeVentas);
		
		Cliente cliente =new Cliente();
		cliente.setNroCBu(741741);
		cliente.setNombre("Carlos");
		
		System.out.println("nombre del vendedor: "+vendedor.getNombre());
		System.out.println("nombre del jefe: "+jefeDeVentas.getNombre());
		System.out.println("nombre del cliente: "+cliente.getNombre());

		vendedor = new Empleado();
		
		
		Contenedor contenedor = new Contenedor();
		
		contenedor.getContenida().mensaje();
		
		contenedor = new Contenedor();
		
		contenedor.getContenida().mensaje();

		Contenido contenida1 =contenedor.getContenida();
		contenedor = new Contenedor();
		
		Scanner sc = new Scanner(System.in);
		int int1= sc.nextInt();
		
	}
}
