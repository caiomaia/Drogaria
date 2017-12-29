package br.caio.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Funcionario;
import br.caio.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException{
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(25L);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = new Funcionario();
		funcionario.setCarteiraTrabalho("2345678");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("25/05/2015"));
		funcionario.setPessoa(pessoa);
		funcionarioDAO.salvar(funcionario);
	}
	@Test
	@Ignore
	public void listar(){
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();
		
		for (Funcionario funcionario : resultado){
			System.out.println("Carteira de trabalho: " + funcionario.getCarteiraTrabalho());
			System.out.println("Data admissão: " + funcionario.getDataAdmissao());
			System.out.println("Nome do funcionário: " + funcionario.getPessoa().getNome());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 28L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		System.out.println("Carteira de trabalho: " + funcionario.getCarteiraTrabalho());
		System.out.println("Data admissão: " + funcionario.getDataAdmissao());
		System.out.println("Nome do funcionário: " + funcionario.getPessoa().getNome());
		System.out.println();
	}
	@Test
	@Ignore
	public void editar(){
		Long codigo = 28L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		funcionario.setDataAdmissao(new Date());
		funcionarioDAO.editar(funcionario);
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 28L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		funcionarioDAO.excluir(funcionario);
	}
}
