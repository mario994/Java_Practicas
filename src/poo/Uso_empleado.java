package poo;
import java.util.*;
public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
		+ " Fecha de alta " + empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de alta " + empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de alta " + empleado3.dameFechaContrato());
		*/
		Empleado[] misEmpleados = new Empleado[5];
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Paco Gomez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Paco Gomez", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez", 47500, 2009, 11, 9);
		misEmpleados[4] = new Jefatura("Maria", 95000, 1999, 5, 26);
		Jefatura jefe_finanzas = (Jefatura) misEmpleados[4];
		jefe_finanzas.estableceIncentivo(55000);
		System.out.println(jefe_finanzas.tomarDesiciones("Dar más dias de vacaciones a los empleados"));
		System.out.println("El jefe " + jefe_finanzas.dameNombre() + " tiene un bonus de: "
				+ jefe_finanzas.estableceBonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));
		
		/*
		for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		*/
		
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + 
					" Sueldo " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}
	}

}

class Empleado implements Comparable, Trabajadores{
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String dameNombre() { //getter
		return nombre; 
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado = (Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	private String nombre; 
	private double  sueldo;
	private  Date altaContrato;
	
	@Override
	public double estableceBonus(double gratificacion) {
		
		return Trabajadores.bonusBase + gratificacion;
	}
}

class Jefatura extends Empleado implements Jefes {
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	public void estableceIncentivo(double b) {
		incentivo = b;
	} 
	
	public double dameSueldo() {
		return   super.dameSueldo() + incentivo;
	}
	double incentivo;
	
	@Override
	public String tomarDesiciones(String decision) {
		return "Un miembro de la direccion ha tomado la decisión de: " + decision;
	}
	@Override
	public double estableceBonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonusBase + gratificacion + prima;
	}
}

