package Ejercicio3;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	

	private String cliente;
	private List<Item> listaItems;
	
	
	
	
	
	public Presupuesto(String cliente) {
		this.cliente=cliente;
		this.listaItems = new LinkedList<Item>();
	}



	public void agregarItem (Item item) {
		listaItems.add(item);
	}
	
	public double calcularTotal() {
		int total =0;
		for(Item i : listaItems) {
			total+=i.costo();
		}
		return total;
		
	}


	public LocalDate getFecha() {
		return LocalDate.now();
	}



	public String getCliente() {
		return cliente;
	}
	
	
	
	
	

}
