package Ejercicio13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarpetaTest {
	
	
	private Carpeta destino;
	private Email mail; 
	private Carpeta destino2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		destino = new Carpeta ();
		destino2 = new Carpeta ();
		
	}
	
	@Test
	void testMover () {
		destino.guardarEmail(mail);
		assertEquals (1,destino.getEmails().size());
		assertEquals(0,destino2.getEmails().size());
		destino.mover(mail, destino2);
		assertEquals(0,destino.getEmails().size());
		assertEquals(1,destino2.getEmails().size());
	
	}
	
	
	

}
