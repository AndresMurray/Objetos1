package Ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio17.DateLapse;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class DateLapseTest {
	
	private DateLapse dateUno;
	private DateLapse dateDos;
	private DateLapse dateTres;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		LocalDate fechaUno = LocalDate.of(2024, 8, 10);
		LocalDate fechaDos = LocalDate.of(2024, 8, 12);
	
		// caso normal
		dateUno = new DateLapse(fechaUno,fechaDos);
		
		dateDos = new DateLapse(fechaDos,fechaDos);
		
		dateTres = new DateLapse(fechaDos,fechaUno);
		
	}
	
	
	@Test
	void TestSizeInDays() {
	
	
		// caso normal
		assertEquals(2,dateUno.sizeInDays());
		
		// fechas iguales
	
		assertEquals(0,dateDos.sizeInDays());
		
		// fechas invertidas
		
		assertTrue(dateTres.sizeInDays() < 0);
		
		
		
	}
	
	@Test 
	void IncludesDaysTest(){
		
		assertTrue(dateUno.includesDate(LocalDate.of(2024, 8, 11)));
		
		assertFalse(dateUno.includesDate(LocalDate.of(2024, 8, 15)));
		assertFalse(dateUno.includesDate(LocalDate.of(2024, 8, 10)));
		
		
		
		
	}

}
