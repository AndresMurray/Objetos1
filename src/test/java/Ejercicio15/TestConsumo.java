package Ejercicio15;



import java.time.LocalDate;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TestConsumo {
	
	private Consumo unConsumo;
	private CuadroTarifario cuadro;
	
	
	@BeforeEach
	void setUp () throws Exception{
		
		cuadro = new CuadroTarifario(1);  
		unConsumo = new Consumo (2,1,LocalDate.of(1980, 6, 2));
		
	}
	
	@Test
	void testgetConsumo() {
		
		assertEquals(unConsumo.getConsumo(cuadro),2);
		
	}

}
