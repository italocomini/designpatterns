package br.com.italocomini.designpatterns.state;

public class Desligar implements Estado {

	@Override
	public void acao() {
		System.out.println("Desligando da TV ...");
	}

}
