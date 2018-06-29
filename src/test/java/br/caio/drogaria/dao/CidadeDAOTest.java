package br.caio.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Cidade;
import br.caio.drogaria.domain.Estado;

public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar(){
		EstadoDAO estadoDAO = new EstadoDAO();		
		Estado estado = estadoDAO.buscar(1L);
		
		Cidade cidade = new Cidade();
		cidade.setNome("São Paulo");
		cidade.setEstado(estado);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
	}
	@Test
	@Ignore
	public void listar(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();
		for (Cidade cidade : resultado){
			System.out.println("Código: " + cidade.getCodigo());
			System.out.println("Nome: " + cidade.getNome());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println();
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 11L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		
		System.out.println("Código: " + cidade.getCodigo());
		System.out.println("Nome: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println();
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 14L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		cidadeDAO.excluir(cidade);
		System.out.println("Cidade removida: ");
		System.out.println("Código: " + cidade.getCodigo());
		System.out.println("Nome: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println();
	}
	@Test
	@Ignore
	public void editar(){
		Long codigoCidade = 13L;
		Long codigoEstado = 15L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado); 
		System.out.println("Codigo do Estado: " + estado.getCodigo());
		System.out.println("Nome do Estado: " + estado.getNome());
		System.out.println("Sigla do Estado: " + estado.getSigla());
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		System.out.println("Cidade a ser editada: ");
		System.out.println("Código: " + cidade.getCodigo());
		System.out.println("Nome: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println();
		
		cidade.setNome("Guarapuava");
		cidade.setEstado(estado);
		cidadeDAO.editar(cidade);
		
		System.out.println("Cidade editada: ");
		System.out.println("Código: " + cidade.getCodigo());
		System.out.println("Nome: " + cidade.getNome());
		System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println();
	}
	
	
	@Test
	@Ignore
	public void buscarPorEstado(){
		Long estadoCodigo = 1L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.buscarPorEstado(estadoCodigo);
		for (Cidade cidade : resultado){
			System.out.println("Código: " + cidade.getCodigo());
			System.out.println("Nome: " + cidade.getNome());
			System.out.println("Codigo do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println();
		}
	}
}
