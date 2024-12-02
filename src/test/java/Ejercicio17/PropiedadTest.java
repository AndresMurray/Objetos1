package Ejercicio17;


import java.time.LocalDate;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;


public class PropiedadTest {
	
	
	
	private Propiedad propiedad;
	
	
	// crear propiedad
	// crear reservas y agregarlas a una lista, sumarlo a la propiedad
	// crear un periodo
	
	@BeforeEach
	void setUp() throws Exception{
		
		propiedad = new Propiedad ("54","Depto",100);
		
		propiedad.crearReserva(new DateLapse(LocalDate.of(2024, 10, 5),LocalDate.of(2024, 10, 10)));
		propiedad.crearReserva(new DateLapse(LocalDate.of(2024, 8, 5),LocalDate.of(2024, 9, 1)));
		
		
		
	}
	
	
	@Test
	void testEstaDisponible () {
		
		assertTrue(propiedad.estaDisponible(new DateLapse(LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 5))));
		assertFalse(propiedad.estaDisponible(new DateLapse(LocalDate.of(2024, 8, 5), LocalDate.of(2024, 9, 1))));
		assertFalse(propiedad.estaDisponible(new DateLapse(LocalDate.of(2024, 8, 5), LocalDate.of(2024, 11, 1))));
		
		
	}
	
	@Test
	void testCrearReserva() {
		
		assertTrue(propiedad.crearReserva(new DateLapse(LocalDate.of(2024, 2, 5), LocalDate.of(2024, 2, 7))));
		assertFalse(propiedad.crearReserva(new DateLapse(LocalDate.of(2024, 8, 5), LocalDate.of(2024, 8, 7))));
		
	}
	
	@Test 
	void testCancelarReserva() {
		
		
		DateLapse periodo = new DateLapse(LocalDate.of(2023, 10, 5),LocalDate.of(2023, 10, 10));
		Reserva r = new Reserva (propiedad,periodo);
		propiedad.crearReserva(periodo);
		assertEquals(3,propiedad.getReservas().size());
		propiedad.cancelarReserva(r);
		assertEquals(2,propiedad.getReservas().size());
		
		
	}
	
	

}
