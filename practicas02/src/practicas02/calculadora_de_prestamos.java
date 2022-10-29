package practicas02;

import java.util.Scanner;

public class calculadora_de_prestamos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Igrese numero 1" );
        int amount = scanner.nextInt();
        //your code goes here
        int months = 3;
        for (int i = 0; i < months; i++)
            amount = amount * 90/100;
        System.out.println(amount);

		
	}

}
