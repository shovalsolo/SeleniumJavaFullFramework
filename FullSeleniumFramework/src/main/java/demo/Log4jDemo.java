/* 
 * Class that is implementing logging with log4j need to add dependency to POM file this file is using "log4j2.properties" that is under -> src/main/resources  %%% for impotent
 * log4j2.xml - have more options and is second in priority after the log4j.properties file
 * log4j.properties - Will have first priority before log4j2.xml will configure the log level
 * 
 * Info:
 * https://github.com/apache/logging-log4j2
 * https://springframework.guru/log4j-2-configuration-using-properties-file/
 * https://howtodoinjava.com/log4j2/log4j-2-xml-configuration-example/
 */

package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);				//Creating a logger parameter

	public static void main(String[] args) {
		
		System.out.println("\n Hello world....! Testing the errors levels \n");
		
		logger.trace("This is an trace message");										//Fatal will be logged to console
		logger.info("This is an information message");									//Will not be logged in the console
		logger.error("This is an error message");										//Error and above level will be logged to console
		logger.warn("This is an warning message");										//Will not be logged in the console
		logger.fatal("This is an fatal message");										//Fatal will be logged to console
		
		System.out.println("\n Testing the errors levels - Completed !!!! \n");
		
	}

}
