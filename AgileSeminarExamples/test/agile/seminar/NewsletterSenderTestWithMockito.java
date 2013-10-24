package agile.seminar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class NewsletterSenderTestWithMockito {

	@Test
	public void shouldSendNewletters() {
		MailService stub = mock(MailService.class);
		when(stub.sendMail(anyString(), anyString()))
			.thenReturn(true);

		NewsletterSender sender = new NewsletterSender();
		sender.setMailService(stub);
		
		int sentNews = sender.sendNews();
		
		assertEquals(2, sentNews);
	}
	
	@Test
	public void shouldSendNewletterToBob() {
		MailService mock = mock(MailService.class);
		when(mock.sendMail("bob@bob.com", "Hello Bob!"))
			.thenReturn(true);

		NewsletterSender sender = new NewsletterSender();
		sender.setMailService(mock);
		
		int sentNews = sender.sendNews();
		
		assertEquals(1, sentNews);
		verify(mock)
			.sendMail(eq("bob@bob.com"), eq("Hello Bob!"));
	}
	
	@Test
	public void shouldSendNewletterToAlice() {
		MailService mailService = new MailServiceImpl();
		MailService spy = Mockito.spy(mailService);
		
		NewsletterSender sender = new NewsletterSender();
		sender.setMailService(spy);
		
		int sentNews = sender.sendNews();
		
		verify(spy)
			.sendMail(eq("alice@alice.com"), eq("Hello Alice!"));
	}
	
}
