package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Prueba_Temporizador2 {

	public static void main(String[] args) {
		
		Reloj miReloj = new Reloj();
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		System.exit(0);

	}

}

class Reloj {
	
	public void enMarcha(int intervalo, final boolean sonido) {
		// clase interna local
		class DameLaHora2 implements ActionListener{

			@Override 
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				System.out.println("Imprimo la hora cada 3 segundos" + ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		}
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}	
}
