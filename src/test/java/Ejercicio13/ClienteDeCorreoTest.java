package Ejercicio13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

public class ClienteDeCorreoTest {
	
	private ClienteDeCorreo cliente;
	private Email email;
	private ArrayList<Carpeta> carpetas;
	private Carpeta inbox;
	private Email e;

	
	@BeforeEach
	void setUp() throws Exception {
	
		carpetas = new ArrayList <Carpeta>();
		cliente = new ClienteDeCorreo();
		inbox = new Carpeta ();
		carpetas.add(inbox);
		e = new Email ("soy un email", "tengo un cuerpo");
		
		
	}
	
	@Test
	void testrecibir () {
		assertEquals(0,inbox.getEmails().size());
		this.cliente.recibir(email);
		inbox.guardarEmail(email);
		assertEquals(1,inbox.getEmails().size());
	}
	
	@Test
	void testBuscar () {
		this.cliente.recibir(e);
		assertEquals(e,this.cliente.buscar("soy un email"));
		assertNull(this.cliente.buscar("no existe"));
	
	}
	
	@Test
	void testEspacioOcupado() {
		this.cliente.recibir(e);
		assertEquals(27,this.cliente.espacioOcupado());
	}

	
	
	
}
