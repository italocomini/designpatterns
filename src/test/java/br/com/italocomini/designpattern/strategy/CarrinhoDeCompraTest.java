package br.com.italocomini.designpattern.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.italocomini.designpatterns.strategy.CarrinhoDeCompra;
import br.com.italocomini.designpatterns.strategy.Item;

public class CarrinhoDeCompraTest {

	@Test
	public void calcularTest() {
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarItem(new Item(1, "Monitor", 430.98));
		carrinho.adicionarItem(new Item(2, "Mouse", 30.40));
		carrinho.adicionarItem(new Item(3, "Teclado", 34.53));

		assertEquals(495.91, carrinho.calcular(), 0.0);
	}

}
