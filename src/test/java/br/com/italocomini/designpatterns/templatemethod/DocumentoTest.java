package br.com.italocomini.designpatterns.templatemethod;

import org.junit.Test;

import br.com.italocomini.designpatterns.strategy.CarrinhoDeCompra;
import br.com.italocomini.designpatterns.strategy.Item;

public class DocumentoTest {

	@Test
	public void testConstruir() {
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.setCliente("Joaquim Pedrosa");
		
		carrinho.adicionarItem(new Item(1, "Monitor", 430.98));
		carrinho.adicionarItem(new Item(2, "Mouse", 30.40));
		carrinho.adicionarItem(new Item(3, "Teclado", 34.53));
		
		TxtTemplate template = new CompraTxt(carrinho);
		template.construir();
		
	}

}
