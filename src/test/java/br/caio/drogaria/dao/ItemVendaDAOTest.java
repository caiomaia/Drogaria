package br.caio.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.ItemVenda;
import br.caio.drogaria.domain.Produto;
import br.caio.drogaria.domain.Venda;

public class ItemVendaDAOTest {
	@Test
	@Ignore
	public void salvar(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(16L);
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(30L);
		
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = new ItemVenda();
		
		itemVenda.setQuantidade(new Short("8"));
		itemVenda.setValorParcial(new BigDecimal("17.00"));
		itemVenda.setProduto(produto);
		itemVenda.setVenda(venda);
		
		itemVendaDAO.salvar(itemVenda);
	}
	@Test
	@Ignore
	public void listar(){
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		List<ItemVenda> resultado = itemVendaDAO.listar();
		
		for (ItemVenda itemVenda : resultado){
			System.out.println("Quantidade: " + itemVenda.getQuantidade());
			System.out.println("Valor parcial: " + itemVenda.getValorParcial());
			System.out.println("Produto: " + itemVenda.getProduto().getDescricao());
			System.out.println("Codigo da venda: " + itemVenda.getVenda().getCodigo());
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 33L;
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		System.out.println("Quantidade: " + itemVenda.getQuantidade());
		System.out.println("Valor parcial: " + itemVenda.getValorParcial());
		System.out.println("Produto: " + itemVenda.getProduto().getDescricao());
		System.out.println("Codigo da venda: " + itemVenda.getVenda().getCodigo());
	}
	@Test
	@Ignore
	public void editar(){
		Long codigo = 33L;
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		
		itemVenda.setQuantidade(new Short("10"));
		itemVendaDAO.editar(itemVenda);
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 33L;
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		
		itemVendaDAO.excluir(itemVenda);
	}
}
