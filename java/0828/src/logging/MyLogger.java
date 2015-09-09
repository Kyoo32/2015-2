package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	Logger logger = Logger.getLogger("mylogger");
	
	public static final String errorlog = "log.txt";
	
	private FileHandler logFile =  null;
	
	public MyLogger(){
		try{
			logFile =new FileHandler(errorlog, true);
		} catch(SecurityException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		logFile.setFormatter(new SimpleFormatter());
		logger.setLevel(Level.ALL);
		logger.addHandler(logFile);
	}

	public void log(String message){
		logger.finest(message);
		logger.finer(message);
		logger.fine(message);
		logger.config(message);
		logger.info(message);
		logger.warning(message);
		logger.severe(message);
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}
}

