package br.com.italocomini.designpatterns.chainofresponsibility;

public class BusinessMailHandler implements EmailHandler {
	
	private EmailHandler next;

	public void setNext(EmailHandler handler) {
		next = handler;
	}

	public void handleRequest(Email email) {
		if (!email.getFrom().endsWith("@businessaddress.com")) {
			next.handleRequest(email);
		} else {
			System.out.println("Enviando e-mail de negócios para: "
					+ email.getFrom());
		}

	}
}