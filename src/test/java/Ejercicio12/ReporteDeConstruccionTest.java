package Ejercicio12;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// porque tengo que importar todo eso y en los test de ejemplo no esta y anda igual?

public class ReporteDeConstruccionTest {
	
	private ReporteDeConstruccion reporte;
	private Cilindro cil;
	private Esfera esf;
	private PrismaRectangular prism;
	
	@BeforeEach
	void setUp() throws Exception {
		
		reporte = new ReporteDeConstruccion ();
		
		cil = new Cilindro("Hierro", "Gris", 1, 3);
		
		esf = new Esfera ("Hierro", "Gris", 6);
		
		esf = new Esfera ("Hierro", "Gris", 6);
		
		prism = new PrismaRectangular ("Cristal", "Transparente", 7, 2, 3);
	
	}
	
	@Test
	void getVolumenDeMaterial() {
		
		reporte.agregarPieza(cil);
		reporte.agregarPieza(esf);
		reporte.agregarPieza(prism);
		
		assertEquals(914.2034621946297,reporte.getVolumenDeMaterial("Hierro"), 0.01); //9,4247779607693797153879301498385
															   // 904,7786842338604526772412943845
																//914,20346219462983239262922453434 que hago con las diferencias minimas de resultados?
		
	}
	
	@Test
	void getSuperficieDeColor() {
		
		reporte.agregarPieza(cil);
		reporte.agregarPieza(esf);
		reporte.agregarPieza(prism);
		
		assertEquals(82,reporte.getSuperficieDeColor("Transparente"));
		
	}
	
	

}
