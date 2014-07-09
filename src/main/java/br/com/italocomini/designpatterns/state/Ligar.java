package br.com.italocomini.designpatterns.state;

public class Ligar implements Estado {

	@Override
	public void acao() {
		System.out.println("Ligando a TV ...");
	}

}
