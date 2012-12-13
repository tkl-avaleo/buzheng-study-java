package org.buzheng.study.threadlocal;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleThreadLogger {

	private final static ThreadLocal<Logger> threadLocal 
			= new ThreadLocal<Logger>();
	
	public static void log(String msg) {
		getThreadLogger().log(Level.INFO, msg);
	}
	
	private static Logger getThreadLogger() {
		Logger logger = threadLocal.get();
		
		if (logger == null) {
			logger = Logger.getLogger(Thread.currentThread().getName());
			
			try {
				logger.addHandler(new FileHandler(Thread.currentThread().getName() + ".log"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			threadLocal.set(logger);
		}
		
		return logger;
	}
	
}
