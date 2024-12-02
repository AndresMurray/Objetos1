package Ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class DateLapseDosTest {
	
	private DateLapseDos dateUno;
	private DateLapseDos dateDos;
	private DateLapseDos dateTres;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		LocalDate fechaUno = LocalDate.of(2024, 8, 10);
		LocalDate fechaDos = LocalDate.of(2024, 8, 12);
	
		// caso normal
		dateUno = new DateLapseDos(fechaUno,fechaDos);
		
		dateDos = new DateLapseDos(fechaDos,fechaDos);
		
		dateTres = new DateLapseDos(fechaDos,fechaUno);
		
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
