package agile.seminar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NewsletterSenderTest {

	@Test
	public void shouldSendNewletters() {
		MailServiceStub mailServiceStub = new MailServiceStub();

		NewsletterSender sender = new NewsletterSender();
		sender.setMailService(mailServiceStub);
		
		int sentNews = sender.sendNews();
		
		assertEquals(2, sentNews);
		assertEquals(2, mailServiceStub.getSentMailsCount()); // eventuality state verification
	}
	
}
