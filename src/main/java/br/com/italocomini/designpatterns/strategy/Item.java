package br.com.italocomini.designpatterns.strategy;

public class Item {

	private int codigo;
	private String nome;
	private double valor;

	public Item(int codigo, String nome, double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
