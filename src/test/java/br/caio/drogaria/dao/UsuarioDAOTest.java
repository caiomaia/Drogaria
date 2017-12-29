package br.caio.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.caio.drogaria.domain.Pessoa;
import br.caio.drogaria.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	@Ignore
	public void salvar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(22L);
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("123senha");
		usuario.setTipo('G'); // A de ADM -- para character, inserir uma letra entre apostrofes ' '
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
	}
	@Test
	@Ignore
	public void listar(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();
		
		for (Usuario usuario : resultado){
			System.out.println("Nome de usuário: " + usuario.getPessoa().getNome());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println("Tipo: " + usuario.getTipo());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 34L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		System.out.println("Nome de usuário: " + usuario.getPessoa().getNome());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Tipo: " + usuario.getTipo());
		System.out.println();
	}
	@Test
	@Ignore
	public void editar(){
		Long codigo = 34L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		usuario.setTipo('G');
		usuario.setSenha("senha123");
		usuarioDAO.editar(usuario);
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 34L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		usuarioDAO.excluir(usuario);
	}
}
