package br.caio.drogaria.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.management.RuntimeErrorException;

import org.omnifaces.util.Messages;

import br.caio.drogaria.dao.EstadoDAO;
import br.caio.drogaria.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable {
	private Estado estado;
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void novo(){
		estado = new Estado();
	}
	
	public void salvar(){
		try{
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
		Messages.addGlobalInfo("Estado salvo com sucesso");
		
		novo();
		throw new RuntimeException("Erro forçado");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar o estado");
			erro.printStackTrace();
			
		}
	}
}
