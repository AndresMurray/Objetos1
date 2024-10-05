package Ejercicio5;

public class Circulo implements Figura2D {
	
	private double radio;
	
	
	
	public double getDiametro () {
		return this.radio*2;
	}
	
   

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return (this.radio*2)*Math.PI;
	}
	
	public double getArea() {
		return Math.PI*(this.radio*this.radio);
		
	}
    
    
    

}
