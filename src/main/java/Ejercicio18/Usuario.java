package Ejercicio18;
import java.util.*;

import ParcialUno.DateLapse;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> propiedades;
	
	
	//constructores,instancias,metodos con funcionalidad
	// 
	 /*Calcular los ingresos de un propietario: Se debe calcular la retribución a un
	 propietario, la cual es el 75% de la suma de precio totales de las reservas incluidas
	 en un período específico de tiempo*/
	
	public double calcularIngresos (DateLapse periodo) {
		
		return propiedades.stream()
				.mapToDouble(p -> p.precioTotalReservas(periodo))
				.sum()*0.75;
		
	}
	
	
	
	
	

}
