package br.edu.dac.filipe.projetojpa.model.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Planta{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String nomeDaPlanta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeDaPlanta() {
		return nomeDaPlanta;
	}
	public void setNomeDaPlanta(String nomeDaPlanta) {
		this.nomeDaPlanta = nomeDaPlanta;
	}
	
	@Override
	public String toString() {
		return nomeDaPlanta+"\n";
	}
}
