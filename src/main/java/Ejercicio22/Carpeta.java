package Ejercicio22;
import java.util.*;
import Ejercicio21.BagImpl;
import Ejercicio21.Bag;

public class Carpeta {
	
	private ArrayList<Email> emails;
	private String nombre;
	
	
	public Carpeta() {
		this.emails = new ArrayList<Email>();
	}
	
	public void guardarEmail(Email mail) {
		this.emails.add(mail);
	}

	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Email> getEmails(){
		return this.emails;
	}
	
	
	
	
	public void mover (Email email, Carpeta destino) {
		destino.guardarEmail(email);
		this.emails.remove(email);
	}
	
	public Email buscar (String texto) {
		
		return this.emails
				.stream()
				.filter(email -> email.contiene(texto))
				.findFirst().orElse(null);
	}
	
	
	public int espacioOcupado () {
		
		return this.emails.stream()
				.mapToInt(email -> email.espacioOcupado())
				.sum();
		
	}
	
	public int cantidadEmails () {
		
		return this.cantidadEmails();
		
	}

	
	public BagImpl<String> mailsPorCategoria(){
		
		BagImpl<String> b = new BagImpl<String>();
		this.emails.forEach(e -> b.add(e.getCategoria()));
		
		return b;
		
	}
	

}
