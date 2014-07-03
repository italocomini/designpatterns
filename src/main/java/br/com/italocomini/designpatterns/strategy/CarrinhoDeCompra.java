package br.com.italocomini.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	private List<Item> itens;

	public CarrinhoDeCompra() {
		this.itens = new ArrayList<Item>();
	}

	public void adicionarItem(Item item) {
		this.itens.add(item);
	}

	public void removerItem(Item item) {
		this.itens.remove(item);
	}

	public double calcular() {
		return itens.stream().mapToDouble(t -> t.getValor()).sum();
	}
	
	public void pagar(Pagamento pagamento) {
		pagamento.pagar(calcular());
	}

}
