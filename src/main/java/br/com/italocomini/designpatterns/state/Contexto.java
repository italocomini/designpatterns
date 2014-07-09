package br.com.italocomini.designpatterns.state;

public class Contexto implements Estado {

	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public void acao() {
		this.estado.acao();
	}

}
