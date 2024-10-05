package Ejercicio4;
import java.time.LocalDate;
import java.util.*; // agregado en ejercicio 4

public class Ticket {
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> listProd; // nuevo ej4
	
	
	
	
	
	public Ticket(List<Producto> listProd,double pesoTotal,double precioTotal,int cantidadDeProductos,LocalDate fecha) {
		this.listProd = listProd;
		this.pesoTotal=pesoTotal;
		this.precioTotal=precioTotal;
		this.cantidadDeProductos=cantidadDeProductos;
		this.fecha=fecha;
		
	}
	

	public double impuesto() {
		return this.precioTotal*0.21;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public List<Producto> getProductos(){ //nueva funcionalidad ej4
		return listProd;
	}

}
