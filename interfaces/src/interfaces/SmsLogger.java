package interfaces;

public class SmsLogger implements Logger{    //logger� smsloggera uyarla. (implemente et)

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi : " + message);
	}
	
}
