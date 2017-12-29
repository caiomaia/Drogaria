package br.caio.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Fabricante;
import br.caio.drogaria.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@Ignore
	public void salvar(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Produto produto = new Produto();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("18"));
		produto.setDescricao("Dorflex");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("5.00"));
		produto.setQuantidade(new Short("10"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
	}
	@Test
	@Ignore
	public void listar(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();
		
		for(Produto produto : resultado){
			System.out.println("Codigo do produto: " + produto.getCodigo());
			System.out.println("Descrição do produto: " + produto.getDescricao());
			System.out.println("Codigo do fabricante: " + produto.getFabricante().getCodigo());
			System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
			System.out.println("Preço do produto: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 16L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		System.out.println("Codigo do produto: " + produto.getCodigo());
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Codigo do fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println();
	}
	@Test
	@Ignore
	public void editar(){
		Long codigoProduto = 16L;
		Long codigoFabricante = 17L;
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);
		
		System.out.println("Produto a ser editado: ");
		System.out.println("Codigo do produto: " + produto.getCodigo());
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Codigo do fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println();
		
		produto.setDescricao("Cataflan 50mg com 10 comprimidos");
		produto.setFabricante(fabricante);
		produtoDAO.editar(produto);
		
		System.out.println("Produto editado: ");
		System.out.println("Codigo do produto: " + produto.getCodigo());
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Codigo do fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println();
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 20L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		produtoDAO.excluir(produto);
		System.out.println("Produto excluido: ");
		System.out.println("Codigo do produto: " + produto.getCodigo());
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Codigo do fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println();
	}
}
