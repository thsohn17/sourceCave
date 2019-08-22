package com.list.study.quartz.test;

import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTest {
	
	@Test
	public void testHelloJob() throws SchedulerException, InterruptedException {
        // 스케줄러 실행 및 JobDetail과 Trigger 정보로 스케줄링
        Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
        defaultScheduler.start();
        Thread.sleep(3 * 1000);  // Job이 실행될 수 있는 시간 여유를 준다
        // 스케줄러 종료
        defaultScheduler.shutdown(true);
	}
}
