package Ejercicio12;

public class PrismaRectangular extends Pieza {
	
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	//                                                             7               2             3
	public PrismaRectangular (String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material,color);
		this.altura=altura;
		this.ladoMayor=ladoMayor;
		this.ladoMenor=ladoMenor;
	}
	
	public double getVolumen () {
		
		return this.ladoMayor*this.ladoMenor*this.altura;
	}
	
	public double getSuperficie () {
		return 2*(this.ladoMayor*this.ladoMenor+this.ladoMayor*this.altura+this.ladoMenor*this.altura);
	}
	
	

}
