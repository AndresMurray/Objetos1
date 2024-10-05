package Ejercicio7;
import java.util.*;

public class Farola {
	
	private List<Farola> farolas;
	private boolean on;
	

	public Farola () {
		this.farolas=new ArrayList<Farola>();
		this.on = false;
	}
	
	private void agregarFarola (Farola f) {
		this.farolas.add(f);
	}

	
	public void pairWithNeighbor( Farola otraFarola ) {
			this.agregarFarola(otraFarola);
			otraFarola.agregarFarola(this);
		
	}
	
	public List<Farola> getNeighbors (){
		return this.farolas; 
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.on=true;
			this.getNeighbors().forEach(neighbors->neighbors.turnOn()); // forma de iterar sobre una coleccion
			//for(Farola f: this.farolas) 
				//f.turnOn();
		}
	}
		
	public void turnOff() {
		if(this.isOn()) {
			this.on=false;
			for(Farola f: this.farolas) 
				f.turnOff();
		}
	}
	
	public boolean isOn() {
		return this.on;
	}
	
	public boolean isOff() {
		return !this.on;
	}
	


}
