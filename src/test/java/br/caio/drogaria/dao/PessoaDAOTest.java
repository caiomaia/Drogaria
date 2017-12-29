package br.caio.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Cidade;
import br.caio.drogaria.domain.Pessoa;

public class PessoaDAOTest {
	@Test
	@Ignore
	public void salvar(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(23L);
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Angel Romero");
		pessoa.setCpf("111.111.111-11");
		pessoa.setRg("12345678910");
		pessoa.setRua("Avenida Itaquera");
		pessoa.setNumero(new Short("11"));
		pessoa.setBairro("Itaquera");
		pessoa.setCep("11111-111");
		pessoa.setTelefone("11111111");
		pessoa.setCelular("900001111");
		pessoa.setEmail("romeroitaquera@gmail.com");
		pessoa.setCidade(cidade);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
	}
	@Test
	@Ignore
	public void listar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		for (Pessoa pessoa : resultado){
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("RG: " + pessoa.getRg());
			System.out.println("Rua: " + pessoa.getRua() + ", " + pessoa.getNumero());
			System.out.println("Bairro: " + pessoa.getBairro() + " CEP: " + pessoa.getCep());
			System.out.println("Cidade: " + pessoa.getCidade().getNome() + " Estado: " 
			+ pessoa.getCidade().getEstado().getNome());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("Celular: " + pessoa.getCelular());
			System.out.println("e-mail: " + pessoa.getEmail());
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 22L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("Rua: " + pessoa.getRua() + ", " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro() + " CEP: " + pessoa.getCep());
		System.out.println("Cidade: " + pessoa.getCidade().getNome() + " Estado: " 
		+ pessoa.getCidade().getEstado().getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Celular: " + pessoa.getCelular());
		System.out.println("e-mail: " + pessoa.getEmail());
	}
	@Test
	@Ignore
	public void editar(){
		Long codigoPessoa = 22L;
		Long codigoCidade = 9L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		pessoa.setNome("Ronaldo Nazário de Lima");
		pessoa.setCidade(cidade);
		pessoaDAO.editar(pessoa);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("Rua: " + pessoa.getRua() + ", " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro() + " CEP: " + pessoa.getCep());
		System.out.println("Cidade: " + pessoa.getCidade().getNome() + " Estado: " 
		+ pessoa.getCidade().getEstado().getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Celular: " + pessoa.getCelular());
		System.out.println("e-mail: " + pessoa.getEmail());
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 24L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		pessoaDAO.excluir(pessoa);
		
		System.out.println("Pessoa excluida: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("Rua: " + pessoa.getRua() + ", " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro() + " CEP: " + pessoa.getCep());
		System.out.println("Cidade: " + pessoa.getCidade().getNome() + " Estado: " 
		+ pessoa.getCidade().getEstado().getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Celular: " + pessoa.getCelular());
		System.out.println("e-mail: " + pessoa.getEmail());
	}
}
