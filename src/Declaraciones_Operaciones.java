
public class Declaraciones_Operaciones {

	public static void main(String[] args) {
		// las operaciones con flotantes deben realizarce con variables que sean tambien flotantes
		//double a = 5;
		//double b;
		//b = 7;
		//double c = b / a; 
		
		final double  pulgadas = 2.54;
		
		double cm = 6;
		double resultado = cm/pulgadas;
	
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
		
		int operador1, operador2, resp;
		
		operador1 = 8;
		operador2 = 7;
		resp = operador1 + operador2;
		System.out.println(resp);
		
	}

}
