package com.Example.TaskSchedule;

import org.apache.log4j.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IndexController {

	
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping("/")
	public String index(){
		
		logger.debug("loading index page");
		logger .info("INFO level message");
		logger.warn("Warn level message");
		logger.error("error level message");
		logger.fatal("fatal level message ");
		
		return "index";
	}
}
