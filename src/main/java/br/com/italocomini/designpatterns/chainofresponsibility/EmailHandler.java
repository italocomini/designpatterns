package br.com.italocomini.designpatterns.chainofresponsibility;

public interface EmailHandler {
	
	/**
	 * Referente ao próximo handler na cadeia.
	 * @param handler
	 */
	public void setNext(EmailHandler handler);

	/**
	 * O handler
	 * @param email
	 */
	public void handleRequest(Email email);
}
