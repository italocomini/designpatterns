package br.com.italocomini.designpattern;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.italocomini.designpattern.strategy.CarrinhoDeCompraTest;
import br.com.italocomini.designpattern.strategy.PagamentoTest;
import br.com.italocomini.designpatterns.chainofresponsibility.EmailProcessorTest;
import br.com.italocomini.designpatterns.templatemethod.DocumentoTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   CarrinhoDeCompraTest.class,
   PagamentoTest.class,
   DocumentoTest.class,
   EmailProcessorTest.class
})
public class JunitTestSuite {

}
