package ParcialUno;

import java.time.LocalDate;
import java.util.*;

public class MainPrueba {
	
	
	public static void main(String[] args) {
	
	Sede sedeUno = new Sede ("Sede Uno", 200,3);
	Sede sedeDos = new Sede ("Sede Dos", 100,4);
	
	ArrayList<Sede> sedes = new ArrayList <Sede>();
	
	sedes.add(sedeUno);
	sedes.add(sedeDos);

	
	Evento evento = new EventoPresencial ("Evento Uno", LocalDate.of(2024, 12, 1),"Musica",1000,200,sedes);
	
	// Preguntar si es asi
	Usuario user = new Usuario ("Andres");
	user.comprarEntrada(evento, false);
	
	
	
	
	
	
	}
	

}
