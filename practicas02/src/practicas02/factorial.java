package practicas02;

import java.util.Scanner;

public class factorial {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Igrese numero  " );
		int num = sc.nextInt();
		int factorial = num*num;
		System.out.println("El factorial de "+num+" es: "+ factorial );
	}
}
