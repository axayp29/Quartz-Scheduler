package com.stackabuse.job;

import java.util.Date;
import java.util.stream.IntStream;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@DisallowConcurrentExecution
public class SampleCronJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    	
    	
    	 String jobName = context.getJobDetail().getKey().getName();
    	 
    	 System.err.println("Job Name A: " +jobName + " || Time :"+new Date().getSeconds());
    	
    	
    }
}
