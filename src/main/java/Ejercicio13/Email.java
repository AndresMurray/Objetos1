package Ejercicio13;

import java.util.*;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private ArrayList<Archivo> adjuntos;
	
	
	
	
	
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<Archivo>();
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public ArrayList<Archivo> getAdjuntos() {
		return adjuntos;
	}
	
	public boolean contiene (String texto) {
		return (this.getCuerpo().contains(texto)
				|| this.getTitulo().contains(texto) );
	}
	
	public int espacioOcupado () {
		return this.titulo.length()+this.cuerpo.length()
		+ this.adjuntos.stream()
		.mapToInt(adjunto -> adjunto.espacioOcupado())
		.sum();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
