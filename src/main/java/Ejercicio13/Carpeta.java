package Ejercicio13;
import java.util.*;

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
	
	
	

}
