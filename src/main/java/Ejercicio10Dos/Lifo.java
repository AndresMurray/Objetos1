package Ejercicio10Dos;

import java.util.List;

public class Lifo extends Strategy {
	
	
	
	public Lifo() {
		super("Lifo");
	}

	public JobDescription nextJob(List<JobDescription> jobs) {
		
		return jobs.get(jobs.size()-1);
		
	}

}
