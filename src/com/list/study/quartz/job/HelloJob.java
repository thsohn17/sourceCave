/**
 * 
 */
package com.list.study.quartz.job;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author thsohn
 * @since 2019-08-22
 *
 */
public class HelloJob implements Job{
	public static Logger logger = Logger.getLogger(HelloJob.class);
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.info("### Hello Job is being executed!");
	}
}
