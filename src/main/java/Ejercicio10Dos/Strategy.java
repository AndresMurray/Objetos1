package Ejercicio10Dos;
import java.util.*;

public abstract class Strategy {
	
	private String name;
	
	public Strategy(String name) {
		this.name=name;
	}
	public abstract JobDescription nextJob(List<JobDescription> jobs);
	
	public String getName() {
		return this.name;
	}

}
