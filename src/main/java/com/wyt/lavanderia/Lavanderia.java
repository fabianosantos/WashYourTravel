package com.wyt.lavanderia;

public class Lavanderia {
	
	String id;
	String descricao;
	Integer avaliacao;

	public Lavanderia() {
	}
	
	public Lavanderia(String id, String descricao, Integer avaliação) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.avaliacao = avaliação;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Integer avaliação) {
		this.avaliacao = avaliação;
	}

	@Override
	public String toString() {
		return "Lavanderia [id=" + id + ", descricao=" + descricao + ", avaliacao=" + avaliacao + "]";
	}
	
}
