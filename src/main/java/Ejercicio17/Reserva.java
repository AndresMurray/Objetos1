package Ejercicio17;
import java.util.*;
import java.time.*;

public class Reserva {
	
	private Propiedad propiedad;
	private DateLapse periodo;
	
	
	public Reserva (Propiedad propiedad, DateLapse periodo) {
		this.propiedad=propiedad;
		this.periodo=periodo;
	}
	
	
	 public boolean overlaps (DateLapse another) {
		 
		 return this.periodo.overlapse(another);
				 
	 }
	 
	 public double calcularPrecio() {
		 
		 return periodo.sizeInDays()*propiedad.getPrecio();
		 
	 }
	 
	 public boolean reservaEnCurso() {
		return this.periodo.includesDate(LocalDate.now());
	 }
		
	   // Sobrecargar equals y hashCode para asegurar una comparación adecuada
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Reserva reserva = (Reserva) o;
	        return Objects.equals(propiedad, reserva.propiedad) &&
	               Objects.equals(periodo, reserva.periodo);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(propiedad, periodo);
	    }
	 
	 
	 

	
	
	

}
