package br.com.italocomini.designpattern.strategy;

import org.junit.Test;

import br.com.italocomini.designpatterns.strategy.CarrinhoDeCompra;
import br.com.italocomini.designpatterns.strategy.CartaoDeCredito;
import br.com.italocomini.designpatterns.strategy.DebitoEmConta;
import br.com.italocomini.designpatterns.strategy.Item;
import br.com.italocomini.designpatterns.strategy.Pagamento;

public class PagamentoTest {

	@Test
	public void test() {

		Pagamento cartao = new CartaoDeCredito("Joaquim Pedrosa", "1234566", "234", "01/01/2016");
		Pagamento debido = new DebitoEmConta("342", "423434-34");

		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarItem(new Item(1, "Monitor", 430.98));
		carrinho.adicionarItem(new Item(2, "Mouse", 30.40));
		carrinho.adicionarItem(new Item(3, "Teclado", 34.53));
		
		carrinho.pagar(debido);
		
		carrinho.adicionarItem(new Item(3, "Fone", 10.0));
		carrinho.pagar(cartao);

	}

}
