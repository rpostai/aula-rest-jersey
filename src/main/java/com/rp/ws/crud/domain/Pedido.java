package com.rp.ws.crud.domain;

import java.util.List;

public class Pedido {

	private String cliente;
	
	private List<Produto> produtos;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
