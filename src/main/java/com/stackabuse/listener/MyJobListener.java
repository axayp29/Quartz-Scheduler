package com.stackabuse.listener;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.springframework.context.annotation.Configuration;

@Configuration	
public class MyJobListener implements JobListener {
    @Override
    public String getName() {
        return "MyJobListener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        // This method is called before a job is executed
    }

    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        // This method is called after a job has been executed
    	 String jobName = context.getJobDetail().getKey().getName();
    	System.err.println("Listener Called Job Name : " +jobName +" : Timing :" + new Date().getSeconds());
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        // This method is called if the job execution is vetoed
    }
}
