package br.edu.dac.filipe.projetojpa.model.service;



import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.dac.filipe.projetojpa.controller.PlantaController;
import br.edu.dac.filipe.projetojpa.model.dao.FazendeiroDAO;
import br.edu.dac.filipe.projetojpa.model.dao.PlantaDAO;
import br.edu.dac.filipe.projetojpa.model.entity.Fazendeiro;
import br.edu.dac.filipe.projetojpa.model.entity.Planta;

@Service
public class UpdateService {
	
	@Autowired
	private FazendeiroDAO fazendeiroDAO;
	
	
	@Autowired
	private PlantaController plantaController;
	
	private Scanner leitor = new Scanner(System.in);

	public void update(Fazendeiro fazendeiro) {
		System.out.print("qual informação alterar? 1-nome 2-idade 3-adicionar planta (outro numero-sair)");
		int opcao = Integer.parseInt(leitor.nextLine());
		switch (opcao) {
		case 1: {
			System.out.print("Qual o novo nome:");
			String nome = leitor.nextLine();
			fazendeiro.setNome(nome);
			break;
		}
		case 2:{
			System.out.print("Qual o nova idade:");
			int idade = Integer.parseInt(leitor.nextLine());
			fazendeiro.setIdade(idade);
			break;
		}
		case 3:{
			System.out.print("nome da planta:");
			String nome = leitor.nextLine();
			List<Planta> plantas = fazendeiro.getPlantas();
			plantas.add(plantaController.createPlanta(nome));
			break;
		}
		}
		fazendeiroDAO.save(fazendeiro);
	}
	
}
