
public class Calculos_conMath {

	public static void main(String[] args) {
		
		//double raiz = Math.sqrt(9);
		
		//para usar numeros de tipo flotante se usa la letra f despues de escribir el número
		//double num1 = 5.85f;
		double base = 5;
		double exponente = 3;
		//int resultado = (int) Math.round(num1); //refundicion o casting de valores
		int resultado = (int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
	}

}
