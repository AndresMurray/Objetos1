package Ejercicio5;

public class Cuadrado implements Figura2D{
	
	private double lado;

	
	public double getLado() {
		return lado;
	}
	public double getPerimetro() {
		return lado*4;
	}
	public double getArea() {
		return lado*lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
	
	
	

}
