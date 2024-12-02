package Ejercicio10Dos;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public String getStrategy() {
        return this.strategy.getName(); 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public JobDescription next() {
        JobDescription nextJob = this.strategy.nextJob(jobs);
        this.unschedule(nextJob);
        return nextJob;

    }

}
