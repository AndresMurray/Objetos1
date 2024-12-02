package Ejercicio15;

import java.time.LocalDate;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestUsuario {
	
	
	private Usuario unUsuario;
	private Usuario unUsuarioDos;
	private Consumo consumoUno;
	private Consumo consumoDos;
	private Consumo consumoUno_uno;
	private Consumo consumoDos_dos;
	private CuadroTarifario cuadro;
	private Factura facturaUno;
	List<Consumo> consumos;
	List<Consumo> consumosDos;
	
	
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		consumos = new ArrayList<Consumo>();
		consumoUno = new Consumo(2,1,LocalDate.of(2020, 1, 2));
		consumoDos = new Consumo(4,3,LocalDate.of(2022, 5, 8));
		consumos.add(consumoUno);
		consumos.add(consumoDos);
		cuadro = new CuadroTarifario (2);
		unUsuario = new Usuario ("Andres","54", consumos);
		
		consumosDos = new ArrayList<Consumo>();
		consumoUno_uno = new Consumo(2,1,LocalDate.of(2020, 1, 2));
		consumoDos_dos = new Consumo(4,1,LocalDate.of(2022, 3, 3));
		consumosDos.add(consumoUno_uno);
		consumosDos.add(consumoDos_dos);
		unUsuarioDos = new Usuario ("Andres","54", consumosDos);
	}
	
	
	@Test
	void testemitirFactura() {
		
		
		// sin bonifiacion
		facturaUno = unUsuario.emitirFactura(cuadro);
		assertTrue(facturaUno.getUsuario().equals("Andres"));
		assertNull(facturaUno.getBonificacion());
		assertEquals(facturaUno.getFecha(),LocalDate.now()); // preguntar esto pero creo q esta bien pq es el momento en q ejecuto el test
		assertEquals(facturaUno.getMontoFinal(),8); //4*2
		
		// con bonificacion
		
		
		
	}
	
	@Test 
	void testgetUltimoConsumo() {
		
		assertTrue(unUsuario.getUltimoConsumo()==consumoDos);
		
	}
	
	@Test 
	void testgetFecha() {
		
		assertEquals(unUsuario.getFecha(),LocalDate.of(2022, 5, 8));
		
		
	}
	
	
	@Test
	void calcularFactorPotencia() {
		
		assertFalse(unUsuario.calcularFactorPotencia());
		assertTrue(unUsuarioDos.calcularFactorPotencia());
		
	}
	
	@Test 
	void montoFinal (){
		
		assertEquals(unUsuario.montoFinal(cuadro),8);
		
	}
}
