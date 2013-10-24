package agile.seminar;

import static java.lang.Math.random;

public class MailServiceImpl implements MailService {

	public boolean sendMail(String email, String text) {
		// Slow, vulnerable and complex method that using network to send email
		boolean isSuccess = random() < 0.1;
		if (isSuccess) {
			System.out.println("Mail sent.");
		} else {
			System.out.println("Failure to send mail.");			
		}
		return isSuccess;
	}

}
