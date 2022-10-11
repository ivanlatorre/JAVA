package practicas02;


import java.util.Scanner;



public class pruebas {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Igrese su Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Hola " + nombre );
		Scanner po = new Scanner(System.in);
		System.out.println("Igrese numero 1" );
		int num1 = po.nextInt();
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese numero 2" );
		int num2 = in.nextInt();
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		int division = num1 / num2;
		double porcentaje = num1 % num2;
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicacion: "+multiplicacion);
		System.out.println("Division: "+division);
		System.out.println("Porcentaje: "+porcentaje);
	}
}
