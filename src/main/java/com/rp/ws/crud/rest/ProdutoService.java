package com.rp.ws.crud.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.rp.ws.crud.domain.Pedido;
import com.rp.ws.crud.domain.Produto;
import com.rp.ws.crud.domain.Usuario;

@Path("/vendas")
public class ProdutoService {

	@POST
	@Path("/login")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(Usuario usuario) {
		return Response.status(200).entity("admin").build();
	}

	@GET
	@Path("/produtos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> getProdutos() {
		List<Produto> list = new ArrayList<>();
		Produto p1 = new Produto();
		p1.setId(1l);
		p1.setNome("Produto 1");
		p1.setQuantidade(10);
		p1.setFoto("img.jpg");
		list.add(p1);

		Produto p2 = new Produto();
		p1.setId(2l);
		p1.setNome("Produto 2");
		p1.setQuantidade(20);
		p1.setFoto("img2.jpg");
		list.add(p2);

		return list;
	}

	@PUT
	@Path("/pedido")
	@Produces(MediaType.APPLICATION_JSON)
	public Response receberPedido(Pedido p) {
		return Response.status(200).entity("ok").build();
	}
}