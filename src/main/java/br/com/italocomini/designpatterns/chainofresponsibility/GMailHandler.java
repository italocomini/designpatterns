package br.com.italocomini.designpatterns.chainofresponsibility;

public class GMailHandler implements EmailHandler {
	
	private EmailHandler next;

	public void setNext(EmailHandler handler) {
		next = handler;
	}

	public void handleRequest(Email email) {
		if (!email.getFrom().endsWith("@gmail.com")) {
			next.handleRequest(email);
		} else {
			System.out.println("Enviando e-mail do GMAIL para: "
					+ email.getFrom());
		}

	}
}