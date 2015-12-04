package com.wyt.pedido;

public class Item {
	
	ItemType tipo;
	Integer quantidade;
	
	public Item() {
	}

	public Item(ItemType tipo, Integer quantidade) {
		super();
		this.tipo = tipo;
		this.quantidade = quantidade;
	}
	
	public ItemType getTipo() {
		return tipo;
	}
	public void setTipo(ItemType tipo) {
		this.tipo = tipo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
