package Ejercicio19;


import java.time.LocalDate;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TestEnvio {
	
	private PersonaFisica p;
	private ClienteCorporativo c;
	private EnvioLocal local;
	private EnvioInterurbano interurbano;
	private EnvioInternacional internacional;
	
	
	@BeforeEach
	void setUp()throws Exception{
		
		local = new EnvioLocal(LocalDate.of(2024, 10, 5),"54","10",5,true);
		interurbano = new EnvioInterurbano(LocalDate.of(2024, 7, 5),"54","10",5,50);
		internacional = new EnvioInternacional(LocalDate.of(2024, 8, 5),"54","10",5);
		
		p = new PersonaFisica ("Andres", "24", 123456);
		c = new ClienteCorporativo ("MercadoLibre", "11", 201563);
		
	}
	
	
	
	@Test
	void testAgregarEnvio() {
		assertEquals(0,p.getEnvios().size());
		p.agregarEnvio(internacional);
		assertEquals(1,p.getEnvios().size());
		p.agregarEnvio(interurbano);
		assertEquals(2,p.getEnvios().size());	
	}
	
	@Test
	void testCostoEnvio () {
		
		p.agregarEnvio(internacional); //5000 + 50
		p.agregarEnvio(local); //1500
		p.agregarEnvio(interurbano);// 100
	
		assertEquals(5985,p.calcularMonto(LocalDate.of(2024, 3, 1), LocalDate.of(2024, 12, 1))); //incluye todos
		assertEquals(0,p.calcularMonto(LocalDate.of(2025, 3, 1), LocalDate.of(2026, 12, 1))); //no incluye
		assertEquals(1350,p.calcularMonto(LocalDate.of(2024, 10, 5), LocalDate.of(2024, 12, 1)));//coincide con el ultimo
		
		
		c.agregarEnvio(internacional);
		assertEquals(5050,c.calcularMonto(LocalDate.of(2024, 3, 1), LocalDate.of(2024, 12, 1)));
		
	}
	
	
	
	
	

}
