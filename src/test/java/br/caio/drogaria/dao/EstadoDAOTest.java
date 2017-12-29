package br.caio.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Estado;

public class EstadoDAOTest {
	@Test
	//@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Parana");
		estado.setSigla("PR");

		EstadoDAO estadoDao = new EstadoDAO();
		estadoDao.salvar(estado);
	}

	@Test
	@Ignore
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();

		// Se eu quiser exibir no console o total de registros encontrados
		System.out.println("Total de registros encontrados: " + resultado.size());

		// Se eu quiser exibir no console os registros encontrados
		for (Estado estado : resultado) {
			System.out.println(estado.getSigla() + "-" + estado.getNome());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 4L; // L para indicar que é um long
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		if (estado == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado");
			System.out.println(estado.getCodigo() + "-" + estado.getSigla() + "-" + estado.getNome());
		}
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 5L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		if (estado == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			estadoDAO.excluir(estado);
			System.out.println("Registro excluido: ");
			System.out.println(estado.getCodigo() + "-" + estado.getSigla() + "-" + estado.getNome());
		}
	}
	@Test
	@Ignore
	public void editar(){
		Long codigo = 7L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		if (estado == null){
			System.out.println("Nenhum registro encontrado");
		} else {
			estado.setNome("Santa Catarina");
			estadoDAO.editar(estado);
			System.out.print("Registro editado: ");
			System.out.println(estado.getCodigo() + "-" + estado.getSigla() + "-" + estado.getNome());
		}
	}
}
