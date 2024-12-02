package Ejercicio20;
import java.time.*;
import java.time.temporal.*;

public abstract class Contrato {
	
	private LocalDate fechaDeInicio;
	private Empleado emp;
	
	public abstract boolean estaVigente() ;
		
	public int getAntiguedad () {
		return (int) ChronoUnit.YEARS.between(this.fechaDeInicio, LocalDate.now());
	}
	
	public abstract double getSueldoBasico();
	
	public Empleado getEmpleado() {
		return this.emp;
	}
	
	
	public double montoTotal (int ant) { 
		if(ant >5 && ant <10)
			return this.getSueldoBasico() *1.30;
		else
			if(ant >10 && ant <15)
				return this.getSueldoBasico() * 1.50;
			else
				if(ant >15 && ant <20)
					return this.getSueldoBasico() * 1.70;
				else
					if(ant >20)
						return this.getSueldoBasico() *2;
					else
						return this.getSueldoBasico();
	}

}
