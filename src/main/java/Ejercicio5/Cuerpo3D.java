package Ejercicio5;

public class Cuerpo3D {
	
	private double altura;
	private Figura2D CaraBasal;
	
	
	
	
	public void setAltura (double altura) {
		this.altura=altura;
	}


	public double getAltura() {
		return altura;
	}
	
	public void setCaraBasal (Figura2D figura) {
		this.CaraBasal=figura;
	}
	
	
	public double getVolumen() {
		return this.CaraBasal.getArea()*altura;
	}
	
	public double getSuperficieExterior () {
		
		return (2*this.CaraBasal.getArea())+(this.CaraBasal.getPerimetro()*altura);
		
	}
	
	
	
	
	
	

}
