package agile.seminar;

public class NewsletterSender {

	private MailService mailService;

	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}

	public int sendNews() {
		int deliveredMails = 0;
		if (sendNewsToBob()) {
			deliveredMails++;
		}
		if (sendNewsToAlice()) {
			deliveredMails++;
		}
		return deliveredMails;
	}
	
	public boolean sendNewsToBob() {
		return mailService.sendMail("bob@bob.com", "Hello Bob!");
	}
	

	public boolean sendNewsToAlice() {
		return mailService.sendMail("alice@alice.com", "Hello Alice!");
	}
	
	public boolean sendNewsToCarol() {
		return mailService.sendMail("carol@carol.com", "Hello Carol!");
	}

}
