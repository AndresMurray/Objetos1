package ParcialUno;

public class Sede {
	
	private String nombre;
	private double precioPorDia;
	private int cantDias;
	
	
	
	public Sede(String nombre, double precioPorDia, int cantDias) {
		this.nombre = nombre;
		this.precioPorDia = precioPorDia;
		this.cantDias = cantDias;
	}



	public double getPrecioTotal() {
		return this.precioPorDia*this.cantDias;
	}

}
