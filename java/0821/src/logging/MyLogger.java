package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();
	
	public static final String errorlog = "log.txt";
	public static final String warninglog = "warning.txt";
	public static final String finelog = "fine.txt";
	
	private FileHandler logFile =  null;
	private FileHandler warningFile =  null;
	private FileHandler fineFile =  null;
	
	
	
	public MyLogger(){
		try{
			logFile =new FileHandler(errorlog, true);
			warningFile =new FileHandler(warninglog, true);
			fineFile =new FileHandler(finelog, true);
		} catch(SecurityException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());
		
		logger.setLevel(Level.ALL);
		
		fineFile.setLevel(Level.FINE);
		warningFile.setLevel(Level.WARNING);
		
		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);
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
	
	public static MyLogger getInstance(){
		return instance;
	}
}

