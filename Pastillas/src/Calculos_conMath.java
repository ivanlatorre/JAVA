
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz = Math.sqrt(9);//mat.sqrt devuelve double
		System.out.println("raiz de 9 tiene q ser double =  "+raiz);
		double hoa = Math.random();
		System.out.println("Random "+hoa);
		float num1=5.85F;// a los float agregarle la F al final sufijo F
		int resultado=Math.round(num1);
		System.out.println("num1 "+resultado);
		double num2=5.85;
		int resultado2=(int)Math.round(num2);//conversion de un double a un int, redondear valores numericos
		System.out.println("resultado2 = "+resultado2);
		double base=5;
		double exponente=3;
		int resultado3=(int)Math.pow(base,exponente);// parametros double y resultado double
		System.out.println("El resultado de "+base+" elevado a "+exponente+ " es "+resultado3);
		System.out.println("metodo pow "+resultado3+" valor conversado a un int ");
		
		
	}

}
