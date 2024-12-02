package ParcialUno;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import Ejercicio14.Date;

public class DateLapse implements Date{
	
	private LocalDate from;
	private LocalDate to;
	
	
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}



	public LocalDate getFrom() {
		return from;	
	}
	
	

	public LocalDate getTo() {
		return to;
	}

	
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return (int)from.until(to,ChronoUnit.DAYS);
	}
	

	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
			
		if(from.isBefore(other) && to.isAfter(other)) 
			return true;
		else
			return false;
		
	}
	
	
	public boolean overlapse (DateLapse periodo) {
		return !((this.from.isAfter(periodo.to)) || (this.to.isBefore(periodo.from)));
	}
	
	
	

	
	
	

}
