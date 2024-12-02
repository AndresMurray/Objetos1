package Ejercicio21;

import java.time.LocalDate;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TestMap {
	
	private Map<String,Integer> mapa;
	
	
	@BeforeEach
	void setUp() throws Exception{
		
	    mapa = new HashMap<>();
		mapa.put("Lionel Messi", 111);
		mapa.put("Gabriel Batistuta", 56);
		mapa.put("Kun Aguero", 42);
		
	
		
		
	}
	
	@Test
	void testEliminar() {
		
		assertTrue(mapa.containsKey("Kun Aguero"));
		mapa.remove("Kun Aguero");
		assertFalse(mapa.containsKey("Kun Aguero"));
		
	}
	
	@Test
	void testModificar() {
		assertEquals(111,mapa.get("Lionel Messi"));
		mapa.put("Lionel Messi", 112);
		assertEquals(112,mapa.get("Lionel Messi"));
		
	}
	
	@Test
	void testRepetirClave() {
		
		mapa.put("Gabriel Batistuta", 10);
		mapa.put("Gabriel Batistuta",3);// modifica el valor, no se crea uno nuevo
		
	}
	
	@Test
	void testCantidadGoles() {
		
		int goles=mapa.values().stream().mapToInt(m -> m.intValue()).sum();
		assertEquals(209,goles);
		
	}
	
	
	@Test
	void testSumarUnGol() {
		
		mapa.put("Lionel Messi", mapa.get("Lionel Messi")+1);
		assertEquals(112,mapa.get("Lionel Messi"));
		
	}
	
	@Test
	void testConJugador() {
		
		Map<Jugador,Integer> mapaDos =new HashMap<>();
		Jugador uno = new Jugador ("Lionel", "Messi");
		Jugador dos= new Jugador ("Kun" ,"Aguero");
		mapaDos.put(uno, 10);
		mapaDos.put(dos, 5);
		
		assertEquals(5,mapaDos.get(dos));
		mapaDos.remove(uno);
		assertFalse(mapaDos.containsKey(uno));
		
	}


}
