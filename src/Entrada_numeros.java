import javax.swing.JOptionPane;

public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("Ingresa un número");
		double num2 = Double.parseDouble(num1);
		System.out.print("la raiz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
