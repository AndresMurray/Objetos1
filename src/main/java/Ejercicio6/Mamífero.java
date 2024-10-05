package Ejercicio6;
import java.time.LocalDate;

public class Mamífero {
	
	private String identificador;
	private String especie;
	private LocalDate fechaNaciemiento;
	private Mamífero padre;
	private Mamífero madre;

	
	
	public Mamífero(String identificador) {
		this.identificador = identificador;
	}
	
	
	
	
	public Mamífero() {
	
	}




	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNaciemiento() {
		return fechaNaciemiento;
	}
	public void setFechaNaciemiento(LocalDate fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}
	public Mamífero getPadre() {
		return padre;
	}
	public void setPadre(Mamífero padre) {
		this.padre = padre;
	}
	public Mamífero getMadre() {
		return madre;
	}
	public void setMadre(Mamífero madre) {
		this.madre = madre;
	}
	public Mamífero getAbueloMaterno() {
		if (this.madre == null)
			return null;
		else
			return this.madre.getPadre();
	}

	
	public Mamífero getAbuelaMaterna() {
		if(this.madre==null)
			return null;
		else
			return this.madre.getMadre();
	}

	
	public Mamífero getAbueloPaterno() {
		if(this.getPadre()== null)
			return null;
		else
			return this.padre.getPadre();
	}





	public Mamífero getAbuelaPaterna() {
		if(this.padre == null)
			return null;
		else
			return this.padre.getMadre();
	}


	


	public Boolean tieneComoAncestroA(Mamífero unMamifero) {
	    // Si no hay padre ni madre, no tiene ancestros
	    if (this.padre == null && this.madre == null) {
	        return false;
	    }

	    // Verificar si el padre es el ancestro o si el ancestro está en la línea del padre
	    if (this.padre != null && (this.padre.equals(unMamifero) || this.padre.tieneComoAncestroA(unMamifero))) {
	        return true;
	    }

	    // Verificar si la madre es el ancestro o si el ancestro está en la línea de la madre
	    if (this.madre != null && (this.madre.equals(unMamifero) || this.madre.tieneComoAncestroA(unMamifero))) {
	        return true;
	    }

	    // Si no se encontró en ninguno de los padres, retornar falso
	    return false;
	}
	
	

}
