package nLayeredDemo.core;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		System.out.println("j logger ile loglandý" + message);
		
		
	}


}
