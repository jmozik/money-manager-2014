package cz.jmoz.projects.mmg.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeClass {
	private static Logger logger = LoggerFactory.getLogger(SomeClass.class);
	
	public SomeClass() {
		logger.info("Initialized...");
		logger.info("Trace...");
	}

}
