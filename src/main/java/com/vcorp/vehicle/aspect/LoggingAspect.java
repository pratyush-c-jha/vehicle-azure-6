package com.vcorp.vehicle.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.vcorp.vehicle.exception.VehicleMainException;

@Component
@Aspect
public class LoggingAspect {
	
	@AfterThrowing(pointcut = "execution(* com.vcorp.vehicle.controller.*.*(..))", throwing = "exception")
	public void logExceptionFromController(VehicleMainException exception) throws VehicleMainException {
		log(exception);
	}
	
	@AfterThrowing(pointcut = "execution(* com.vcorp.vehicle.service.*.*(..))", throwing = "exception")
	public void logExceptionFromService(VehicleMainException exception) throws VehicleMainException {
		
			log(exception);
		
	}
	
	private void log(Exception exception) {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.error(exception.getMessage(), exception);
	}
}
