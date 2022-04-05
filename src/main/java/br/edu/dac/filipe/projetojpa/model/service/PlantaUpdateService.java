package br.edu.dac.filipe.projetojpa.model.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.dac.filipe.projetojpa.model.dao.PlantaDAO;
import br.edu.dac.filipe.projetojpa.model.entity.Planta;

@Service
public class PlantaUpdateService {
	
	@Autowired
	private PlantaDAO plantadao;
	
	public void updatePlant(Planta planta) {
		Scanner leitor =  new Scanner(System.in);
		System.out.print("novo nome da planta:");
		String nome = leitor.nextLine();
		planta.setNomeDaPlanta(nome);
		plantadao.save(planta);
	}
}
