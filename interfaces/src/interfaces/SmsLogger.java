package interfaces;

public class SmsLogger implements Logger{    //loggerý smsloggera uyarla. (implemente et)

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : " + message);
	}
	
}
