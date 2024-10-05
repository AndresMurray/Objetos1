package Ejercicio2;

public class Producto {
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public double getPrecio() {
		return precioPorKilo*peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double p) {
		this.peso=p;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
	

}
