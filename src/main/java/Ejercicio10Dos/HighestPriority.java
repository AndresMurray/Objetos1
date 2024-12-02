package Ejercicio10Dos;
import java.util.*;

public class HighestPriority extends Strategy {
	
	public HighestPriority() {
		super("HighestPriority");
	}
	
	public JobDescription nextJob(List<JobDescription> jobs) {
		
		return jobs.stream().max((j1,j2)-> Integer.compare(j1.getPriority(), j2.getPriority())).orElse(null);
		
	}
	

}
