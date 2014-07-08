package br.com.italocomini.designpatterns.chainofresponsibility;

public class InvalidHandler implements EmailHandler {

	@Override
	public void setNext(EmailHandler handler) {
	}

	@Override
	public void handleRequest(Email email) {
		System.out.println("E-mail bloquado!!");
	}

}
