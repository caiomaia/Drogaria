package br.caio.drogaria.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Cliente;
import br.caio.drogaria.domain.Funcionario;
import br.caio.drogaria.domain.Venda;

public class VendaDAOTest {
	@Test
	@Ignore
	public void salvar(){
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(27L);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(29L);
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = new Venda();
		venda.setHorario(new Date());
		venda.setPrecoTotal(new BigDecimal("30.00"));
		venda.setFuncionario(funcionario);
		venda.setCliente(cliente);
		
		vendaDAO.salvar(venda);
	}
	@Test
	@Ignore
	public void listar(){
		VendaDAO vendaDAO = new VendaDAO();
		List<Venda> resultado = vendaDAO.listar();
		
		for (Venda venda : resultado){
			System.out.println("Horario: " + venda.getHorario());
			System.out.println("Preço total: " + venda.getPrecoTotal());
			System.out.println("Funcionario: " + venda.getFuncionario().getPessoa().getNome());
			System.out.println("Cliente: " + venda.getCliente().getPessoa().getNome());
			System.out.println();
		}
	}
	@Ignore
	@Test
	public void buscar(){
		Long codigo = 30L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		
		System.out.println("Horario: " + venda.getHorario());
		System.out.println("Preço total: " + venda.getPrecoTotal());
		System.out.println("Funcionario: " + venda.getFuncionario().getPessoa().getNome());
		System.out.println("Cliente: " + venda.getCliente().getPessoa().getNome());
		System.out.println();
	}
	@Test
	@Ignore
	public void editar(){
		Long codigo = 31L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		
		venda.setPrecoTotal(new BigDecimal("45.00"));
		vendaDAO.editar(venda);
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 31L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		
		vendaDAO.excluir(venda);
	}
}
