package br.com.italocomini.designpatterns.strategy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@SuppressWarnings("unused")
public class CartaoDeCredito implements Pagamento {

	private String nome;
	private String numero;
	private String digitoVerificador;
	private String dataExpiracao;

	public CartaoDeCredito(String nome, String numero,
			String digitoVerificador, String dataExpiracao) {
		this.nome = nome;
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
		this.dataExpiracao = dataExpiracao;
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
