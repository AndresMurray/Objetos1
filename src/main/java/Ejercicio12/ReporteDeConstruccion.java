package Ejercicio12;
import java.util.*;

public class ReporteDeConstruccion {
	
	private ArrayList<Pieza> lista ;
	
	
	public ReporteDeConstruccion () {
		lista = new ArrayList<Pieza>();
	}
	
	public void agregarPieza (Pieza unaPieza) {
		this.lista.add(unaPieza);
	}
	
	public double getVolumenDeMaterial (String nombreDeMaterial) {
		double vol =0;
		for (Pieza p : lista) {
			if(p.getMaterial().equals(nombreDeMaterial)) {
				vol+=p.getVolumen();
			}
		}
		return vol;
	}
	
	public double getSuperficieDeColor (String unNombreDeColor) {
		double sup =0;
		for (Pieza p : lista) {
			if(p.getColor().equals(unNombreDeColor)) {
				sup+=p.getSuperficie();
			}
		}
		return sup;
	}
		
}


