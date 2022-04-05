package br.edu.dac.filipe.projetojpa.model.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Fazendeiro{

	@Id
	private String cpf;
	
	private String nome;
	private int idade;
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL})
	@JoinColumn(name = "FAZENDEIRO_FK")
	private List<Planta> plantas;
	

	public List<Planta> getPlantas() {
		return plantas;
	}
	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf2) {
		this.cpf = cpf2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return cpf+"\n"+nome+"\n"+idade;
	}
	
}
