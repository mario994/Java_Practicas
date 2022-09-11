package poo;

public interface Trabajadores {
	
	//todos los metodos de una interface son publicos y abstractos por defecto
	
	double estableceBonus(double gratificacion);
	
	// todas las variables por defecto en las interfaces son public static final
	double bonusBase = 1500;
}
