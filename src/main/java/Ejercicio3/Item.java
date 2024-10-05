package Ejercicio3;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}




	public double costo(){
		return costoUnitario*cantidad;
	}




	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	

}
