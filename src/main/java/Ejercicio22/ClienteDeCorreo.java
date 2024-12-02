package Ejercicio22;

import java.util.*;

public class ClienteDeCorreo {
	
	private ArrayList<Carpeta> carpetas;
	private Carpeta inbox;
	
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta();
		this.carpetas.add(inbox);
	}
	
	public void recibir (Email email) {
		inbox.guardarEmail(email);
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream()
				.map(carpeta -> carpeta.buscar(texto)) 
				.filter(email -> email != null)
				.findFirst().orElse(null);

	}
	
	//.map devuelve otro stream donde las carpetas tienen el primer
	// mail que encontraron que contenia o sino tienen null
	
	
	public int espacioOcupado () {
		return this.carpetas.stream()
		.mapToInt(carpeta -> carpeta.espacioOcupado())
		.sum();
	}
	
	public int cantidadTotalEmails() {
		return this.carpetas.stream()
				.mapToInt(c -> c.cantidadEmails())
				.sum();
	}
	
	
	

}
