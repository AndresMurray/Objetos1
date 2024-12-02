package Ejercicio20;

public class ContratoDePlanta extends Contrato {
	
	private double sueldoMensual;
	private double montoHijosACargo;
	private double montoConyugeACargo;
	
	public boolean estaVigente() {
		return true;
	}
	
	public double getSueldoBasico() {
		 double sueldoBasico = this.sueldoMensual;
	     if(this.getEmpleado().tieneConyuge())
	    	sueldoBasico+=this.montoConyugeACargo;
	     if(this.getEmpleado().tieneHijos())
	    	 sueldoBasico+=this.montoHijosACargo;
	     return sueldoBasico;
	}

}
