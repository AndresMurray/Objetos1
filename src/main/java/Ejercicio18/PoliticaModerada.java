package Ejercicio18;

public class PoliticaModerada implements PoliticaDeCancelacion {
	
	public double reembolsar (Reserva r) {
		
		if(r.diasRestantes() > 7)
			return r.calcularPrecio();
		else
			if (r.diasRestantes() >= 2)
				return r.calcularPrecio()*0.50;
			else
				return 0;
	}

}
