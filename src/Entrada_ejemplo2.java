import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		System.out.println("Hola " + nombre + " el año que viene tendrás " + (Integer.parseInt(edad)+1) + " años");
	}

}
