package cn.wspan.SpringBootDemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时任务
 *
 * @author panws
 * @since 2017-08-08
 */
@Component
public class SchedulerTask {
	
	private static final Logger logger = LoggerFactory.getLogger(SchedulerTask.class);
	
	@Scheduled(cron = "0 * * * * ?")
	private void processCronExpression() {
		logger.info("Scheduled task of cron expression: {}", new Date());
	}
	
	@Scheduled(fixedRate = 10000)
	private void processFixedRate() {
		logger.info("Scheduled task of fixed rate : {}", new Date());
	}
	
	@Scheduled(fixedDelay = 5000)
	private void processFixedDelay() {
		logger.info("Scheduled task of fixed delay : {}", new Date());
	}
	
	@Scheduled(initialDelay = 2000, fixedRate = 5000)
	private void processInitialDelay() {
		/*
		 * Exactly one of the 'cron', 'fixedDelay(String)', or 'fixedRate(String)' attributes is required
		 */
		logger.info("Scheduled task of initial delay : {}", new Date());
	}
}
