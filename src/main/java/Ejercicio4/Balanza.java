package Ejercicio4;
import java.util.*;
import java.time.LocalDate;

public class Balanza {
	

	private List<Producto> listaProd;
	
	
	
	public Balanza() {
		this.listaProd = new LinkedList<Producto>();
	}


	public void ponerEnCero () {
		this.listaProd.clear(); //
	} //agregado en ej 4
	
	public void agregarProducto(Producto prod) {
		listaProd.add(prod);
	}
	
	
	
	public int getCantidadDeProductos() {
		return listaProd.size();	}

	public double getPrecioTotal() {
		return listaProd.stream()
				.mapToDouble(Producto::getPrecio)
				.sum();
	}

	public double getPesoTotal() {
		return listaProd.stream()
				.mapToDouble(Producto::getPeso)
				.sum();
	}

	
	public Ticket emitirTicket() { 
		Ticket t = new Ticket (listaProd,this.getPesoTotal(),this.getPrecioTotal(),this.getCantidadDeProductos(),LocalDate.now());	
		return t;

	} 
	

	

	
	public List<Producto> getProductos(){ //nueva funcionalidad ej4
		return listaProd;
	}
	

}
