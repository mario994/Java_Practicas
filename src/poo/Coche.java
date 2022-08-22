package poo;

import javax.swing.JOptionPane;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public String dime_datos_generales() { //GETTER
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + ".Mide " +
			largo/1000 + " metros con un ancho de " + ancho + " cm  y un peso de plataforma de "
			+ peso_plataforma + " kg";
	}
	
	public void  establece_color() { // SETTER
		color = JOptionPane.showInputDialog("Ingresa Color");
	}
	
	public String dime_color() {
		return "El color del coche es " + color;
	}
	
	public void configura_asientos() {
		String asientos = JOptionPane.showInputDialog("¿El coche tiene asientos de cuero?");
		if(asientos.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {
		if(asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configura_climatizador() {
		String climatizador = JOptionPane.showInputDialog("¿El coche tiene climatizador?");
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}
	
	public String  dime_climatizador() {
		if(climatizador == true) {
			return "El coche incorpora climatizador.";
		} else {
			return "El coche lleva aire acondicionado.";
		}
	}
	
	public String dime_peso_coche() { //SETTER GETTER
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		if(asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		if(climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es " + peso_total;
	}
	
	public int precio_coche() { //GETTER
		int precio_final = 10000;
		if(asientos_cuero ==true) {
			precio_final +=2000;
		}
		if(climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
	}
	
	
	
}