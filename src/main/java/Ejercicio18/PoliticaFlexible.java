package Ejercicio18;

public class PoliticaFlexible implements PoliticaDeCancelacion{
	
	public double reembolsar (Reserva r) {
		if(!r.reservaEnCurso())
			return r.calcularPrecio();
		else return 0;
	}

}
