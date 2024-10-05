package Ejercicio9;

public class CuentaCorriente extends Cuenta {
	
	private  int limiteDescubierto;
	
	
	public CuentaCorriente () {
		this.limiteDescubierto=0;
	}


	public void setDescubierto(int limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}


	public int getDescubierto() {
		return limiteDescubierto;
	}
	
	public boolean puedeExtraer (double monto) {
		if(this.getSaldo()+this.limiteDescubierto >= monto) {
			return true; 
		}
		else
			return false;
	}
	
	

}
