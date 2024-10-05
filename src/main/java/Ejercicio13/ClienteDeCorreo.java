package Ejercicio13;

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
	
	
	
	

}
