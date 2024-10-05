package Ejercicio2;
import java.util.*;
import java.time.LocalDate;

public class Balanza {
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> listaProd;
	
	
	
	
	
	public Balanza() {
		this.listaProd = new LinkedList<Producto>();
	}

	public void ponerEnCero () {
		this.precioTotal=0;
		this.pesoTotal=0;
		this.cantidadDeProductos=0;
	}
	
	
	

	/*public void ponerEnCero () {
		this.listaProd.clear(); //
	}*/ //agregado en ej 4
	
	public void agregarProducto(Producto prod) {
		listaProd.add(prod);
		cantidadDeProductos++;
		precioTotal+=prod.getPrecio();
		pesoTotal+=prod.getPeso();
	}
	
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public Ticket emitirTicket() {
		Ticket t = new Ticket ();
		t.setPesoTotal(pesoTotal);
		t.setCantProd(cantidadDeProductos);
		t.setPrecio(precioTotal);
		t.setFecha(LocalDate.now());
		
		return t;

	}
	
	/*
	public Ticket emitirTicket() {  mejora con el ej 4
		Ticket t = new Ticket (listaProd);aca agregue esto para pasarle la lista de productos
		int peso = 0;
		int cantProd = listaProd.size();
		int precio = 0;
		
		for (Producto p : listaProd) {
			peso+=p.getPeso();
			precio+=p.getPrecio();
		}
		t.setPesoTotal(peso);
		t.setCantProd(cantProd);
		t.setPrecio(precio);
		t.setFecha(LocalDate.now());
		
		return t;

	} ej 4
	
	*/
	

	
	public List<Producto> getProductos(){ //nueva funcionalidad ej4
		return listaProd;
	}
	

}
