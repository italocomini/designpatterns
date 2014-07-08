package br.com.italocomini.designpatterns.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;

public class EmailProcessorTest {

	private EmailProcessor processor;

	@Before
	public void setUp() {
		processor = new EmailProcessor();
		processor.addHandler(new BusinessMailHandler());
		processor.addHandler(new GMailHandler());
		processor.addHandler(new InvalidHandler());
	}

	@Test
	public void test() {
		Email gmail = new Email();
		gmail.setFrom("teste@gmail.com");
		processor.handleRequest(gmail);

		Email business = new Email();
		business.setFrom("teste@businessaddress.com");
		processor.handleRequest(business);
	}

}
