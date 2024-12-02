package Ejercicio10Dos;
import java.util.*;

public class Fifo extends Strategy{
	
	public Fifo () {
		super("FIFO");
	}
	
	public JobDescription nextJob(List<JobDescription> jobs) {
		
		return jobs.get(0);
		
	}

}
