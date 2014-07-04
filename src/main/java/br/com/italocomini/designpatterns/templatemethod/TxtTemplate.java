package br.com.italocomini.designpatterns.templatemethod;

import java.util.List;

public abstract class TxtTemplate {

	public void construir() {
		System.out.println(getCabecalho());
		getConteudo().forEach(l -> System.out.println(l));
		System.out.println(getRodape());
	}

	protected abstract String getCabecalho();

	protected abstract List<String> getConteudo();

	protected abstract String getRodape();

}
