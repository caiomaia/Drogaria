package br.caio.drogaria.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.caio.drogaria.dao.FabricanteDAO;
import br.caio.drogaria.domain.Fabricante;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class FabricanteBean implements Serializable{
	private Fabricante fabricante;
	private List<Fabricante> fabricantes;

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public List<Fabricante> getFabricantes() {
		return fabricantes;
	}
	
	public void setFabricantes(List<Fabricante> fabricantes) {
		this.fabricantes = fabricantes;
	}
	
	public void novo(){
		fabricante = new Fabricante();
	}
	
	@PostConstruct
	public void listar(){
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricantes = fabricanteDAO.listar();
		} catch (RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao tentar listar o fabricante");
			erro.printStackTrace();
		}
	}
	
	public void salvar(){
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricanteDAO.salvar(fabricante);
			Messages.addGlobalInfo("Fabricante salvo com sucesso");
			
			novo();
			listar();
		} catch (RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar o fabricante");
			erro.printStackTrace();
		}
	}
	public void excluir(ActionEvent evento){
		fabricante = (Fabricante) evento.getComponent().getAttributes().get("fabricanteSelecionado");
		Messages.addGlobalInfo("Excluido: Nome: " + fabricante.getDescricao());
	}

}
