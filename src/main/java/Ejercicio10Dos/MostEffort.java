package Ejercicio10Dos;

import java.util.List;

public class MostEffort extends Strategy {

	public MostEffort() {
		super("MostEffort");
	}
	
	public JobDescription nextJob(List<JobDescription> jobs) {
		
		return jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
				.orElse(null);
		
	}

}
