package br.com.italocomini.designpatterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompra {

	private String cliente;

	private List<Item> itens;

	public CarrinhoDeCompra() {
		this.itens = new ArrayList<Item>();
	}

	public void adicionarItem(Item item) {
		this.itens.add(item);
	}

	public double calcular() {
		return itens.stream().mapToDouble(t -> t.getValor()).sum();
	}

	public String getCliente() {
		return cliente;
	}

	public void pagar(Pagamento pagamento) {
		pagamento.pagar(calcular());
	}

	public void removerItem(Item item) {
		this.itens.remove(item);
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}

}
