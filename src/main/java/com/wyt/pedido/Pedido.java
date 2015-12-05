package com.wyt.pedido;

import java.util.Date;
import java.util.List;

public class Pedido {
	
	Date data;
	List<Item> items;
	String codigoLavanderia;
	StatusPedido status;
	
	public Pedido() {
	}
	
	public Pedido(Date data, List<Item> items, String codigoLavanderia, StatusPedido status) {
		super();
		this.data = data;
		this.items = items;
		this.codigoLavanderia = codigoLavanderia;
		this.status = status;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getCodigoLavanderia() {
		return codigoLavanderia;
	}
	public void setCodigoLavanderia(String codigoLavanderia) {
		this.codigoLavanderia = codigoLavanderia;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
}
