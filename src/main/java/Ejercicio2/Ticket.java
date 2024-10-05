package Ejercicio2;
import java.time.LocalDate;
import java.util.*; // agregado en ejercicio 4

public class Ticket {
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> listProd; // nuevo ej4
	
	
	
	
	
	/*public Ticket(List<Producto> listProd) {
		this.listProd = listProd;
	} agregado para el ej 4*/ 

	public double impuesto() {
		return this.precioTotal*0.21;
	}
	
	public void setPrecio(double precio) {
		this.precioTotal=precio;
	}
	
	public void setCantProd (int cant) {
		this.cantidadDeProductos=cant;
	}
	
	public void setFecha (LocalDate f) {
		this.fecha=f;
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
