package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Prueba_Temporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora();
		Timer miTemporizador = new Timer(5000, oyente);
		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);
	}

}

class DameLaHora implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora  = new Date();
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
	
}
