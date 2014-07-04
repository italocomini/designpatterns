package br.com.italocomini.designpatterns.templatemethod;

import java.util.ArrayList;
import java.util.List;

import br.com.italocomini.designpatterns.strategy.CarrinhoDeCompra;
import br.com.italocomini.designpatterns.strategy.Item;

public class CompraTxt extends TxtTemplate {

	private CarrinhoDeCompra compra;

	public CompraTxt(CarrinhoDeCompra compra) {
		this.compra = compra;
	}

	@Override
	protected String getCabecalho() {
		return compra.getCliente();
	}

	@Override
	protected List<String> getConteudo() {
		List<String> list = new ArrayList<String>();
		for (Item i : this.compra.getItens()) {
			list.add(String.format("%s|%s", i.getCodigo(), i.getNome()));
		}
		return list;
	}

	@Override
	protected String getRodape() {
		return String.format("Quantidade: %s", this.compra.getItens().size());
	}

}
