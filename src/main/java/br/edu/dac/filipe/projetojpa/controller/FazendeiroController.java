package br.edu.dac.filipe.projetojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.dac.filipe.projetojpa.model.entity.Fazendeiro;
import br.edu.dac.filipe.projetojpa.model.service.FazendeiroService;

@Controller
public class FazendeiroController {
	@Autowired
	private FazendeiroService fazendeiroService;
	
	public void createFazendeiro(String cpf,String nome, int idade) {
		Fazendeiro fazendeiro = new Fazendeiro();
		fazendeiro.setCpf(cpf);
		fazendeiro.setNome(nome);
		fazendeiro.setIdade(idade);
		fazendeiroService.create(fazendeiro);
		
	}
	
	public List<Fazendeiro >list(){
		return fazendeiroService.readAll();
	}
	
	public void atualizar(String cpf) {
		fazendeiroService.update(cpf);
	}
	
	public void deletar(String cpf) {
		fazendeiroService.delete(cpf);
	}
}
