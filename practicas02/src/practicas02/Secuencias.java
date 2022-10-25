package practicas02;

import java.util.Scanner;

public class Secuencias {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = 1, cantidad2;
		
		System.out.println("Ingrese Numero");
		cantidad = sc.nextInt();
		cantidad2 = cantidad;
		
		for(int i=0; i< cantidad; i++) {
			for(int j = 1; j <= cantidad2; j++) {
				System.out.print(j + " ");
				
			}
			cantidad2 -= 1;
			System.out.println();
		}
	}
}
	

	