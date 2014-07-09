package br.com.italocomini.designpatterns.state;

import org.junit.Test;

public class ContextoTest {

	@Test
	public void test() {
		Contexto contexto = new Contexto();

		contexto.setEstado(new Ligar());
		contexto.acao();

		contexto.setEstado(new Desligar());
		contexto.acao();
	}

}
