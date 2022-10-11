package clase_3_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] numeros;
		
		numeros= new String[5];
		
		numeros[0]="asd";
		numeros[1]="asdas";
		
		
		int[] numeros2= {5,2,6,9,7};
		
		System.out.println("posicion 5:"+ numeros[4]);
		
		System.out.println("longitud: "+numeros.length);
		
		System.out.println("ubicacion en memoria: "+numeros);
		
		// Colecciones
		
		//Map
		
		Map<String, Integer> notas = new HashMap<>();
		notas.put("Sergio", 10);
		notas.put("Maria", 10);
		notas.put("Pilar", 5);
		
		Collection<String> coleccion = new ArrayList<String>();
		
		//coleccion =(HashSet<String>) coleccion;
		
		
		System.out.println("Sergio: "+notas.get("Sergio"));
		
		
		List<String> paises = new Vector();
		
		paises.add("Lima");  //1  -> index 0
		paises.add("Bogota"); //2 -> index 1
		paises.add("Cuzco"); //3 ->  index 2
		paises.add("Lima"); // 4 ->  index 3
		
		System.out.println("tamaño : "+paises.size());
		System.out.println("elemento 3 de nuestra lista es: "+paises.get(2));
		System.out.println("Contiene a Argentina? "+paises.contains("Argentina"));
		System.out.println("Contiene a Bogota? "+paises.contains("Bogota"));
		System.out.println(" Bogota tiene el indice numero  =  "+paises.indexOf("Bogota"));
	
		paises.remove("Lima");
		System.out.println("Indice 2: "+paises.get(2));

	}

}
