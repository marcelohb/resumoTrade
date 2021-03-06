package br.com.resumotrade.dominio.mercado;

import javax.persistence.Embedded;

public class Mercado {
	
	private Long id;
	
	@Embedded
	private MercadoId mercadoId;
	private Esporte esporte;
	private String descricao;
	
	
	private Mercado(MercadoId mercadoId, Esporte esporte, String descricao) {
		this.mercadoId = mercadoId;
		this.esporte = esporte;
		this.setDescricao(descricao);
	}
	
	private Mercado(){}
	
	public String descricao() {
		return descricao;
	}
	
	public static Mercado novoFutebol(MercadoId mercadoId, String descricao) {
		return new Mercado(mercadoId, Esporte.FUTEBOL, descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void alterarDescricao(String string) {
		this.setDescricao(string);
	}

	public MercadoId id() {
		return mercadoId;
	}

}
