package br.caio.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Cliente;
import br.caio.drogaria.domain.Pessoa;

public class ClienteDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException{
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(22L);
		
		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2016"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
		
		System.out.println("Cliente salvo com sucesso");
	}
	@Test
	@Ignore
	public void listar(){
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();
		
		for (Cliente cliente : resultado){
			System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
			System.out.println("Data do cadastro: " + cliente.getDataCadastro());
			System.out.println("Liberado: " + cliente.getLiberado());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 26L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
		System.out.println("Data do cadastro: " + cliente.getDataCadastro());
		System.out.println("Liberado: " + cliente.getLiberado());
		System.out.println();
	}
	@Test
	@Ignore
	public void editar(){
		Long codigoPessoa = 27L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoPessoa);
		
		cliente.setLiberado(true);
		clienteDAO.editar(cliente);
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 26L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		
		clienteDAO.excluir(cliente);
	}
}
