package br.com.italocomini.designpatterns.chainofresponsibility;

public class EmailProcessor {
	
	private EmailHandler prevHandler;

	public void addHandler(EmailHandler handler) {
		if (prevHandler != null) {
			prevHandler.setNext(handler);
		}
		prevHandler = handler;
	}

	public void handleRequest(Email email) {
		prevHandler.handleRequest(email);		
	}

}