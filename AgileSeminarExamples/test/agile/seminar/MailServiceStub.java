package agile.seminar;

public class MailServiceStub implements MailService {

	private int sentMailsCount;
	
	public boolean sendMail(String email, String text) { 
		// ignore parameters values
		sentMailsCount++;
		return true; // hard coded return value
	}

	public int getSentMailsCount() {
		return sentMailsCount;
	}

}
