import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = entrada.nextLine();
		System.out.println("Introduce tu edad: ");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombre + " el año que viene tendras " + (edad + 1) + " años" );
		
		

	}

}
