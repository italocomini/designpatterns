package br.com.italocomini.designpatterns.strategy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@SuppressWarnings("unused")
public class DebitoEmConta implements Pagamento {

	private String agencia;
	private String numeroDaConta;

	public DebitoEmConta(String agencia, String numeroDaConta) {
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
	}

	@Override
	public void pagar(double montante) {
		System.out.println("Valor: " + montante);
		System.out.println("Pagando : " + this.toString());
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
