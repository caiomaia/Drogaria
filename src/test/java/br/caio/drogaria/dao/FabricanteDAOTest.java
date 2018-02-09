package br.caio.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Fabricante;

public class FabricanteDAOTest {
	@Test
	@Ignore
	public void salvar(){
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("EMS");
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}
	@Test
	@Ignore
	public void listar(){
		FabricanteDAO FabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = FabricanteDAO.listar();
		
		System.out.println("Total de registros encontrados: " + resultado.size());
		
		for (Fabricante fabricante : resultado){
			System.out.println("Codigo: " + fabricante.getCodigo() + " - Descrição: " + fabricante.getDescricao());
		}
	}
	
	@Test
	@Ignore
	public void merge(){
		//Fabricante fabricante = new Fabricante();
		//fabricante.setDescricao("Cremer S.A.");
		
		//FabricanteDAO fabricanteDAO = new FabricanteDAO();
		//fabricanteDAO.merge(fabricante);
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(36L);
		fabricante.setDescricao("Cremer");
		fabricanteDAO.merge(fabricante);
	}
}
