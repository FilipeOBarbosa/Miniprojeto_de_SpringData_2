package br.edu.dac.filipe.projetojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.dac.filipe.projetojpa.model.entity.Planta;
import br.edu.dac.filipe.projetojpa.model.service.PlantaService;

@Controller
public class PlantaController {
	
	@Autowired
	private PlantaService plantaService;
	
	public Planta createPlanta(String nome) {
		Planta planta = new Planta();
		planta.setNomeDaPlanta(nome);
		plantaService.create(planta);
		return planta;
	}
	
	public List<Planta >list(){
		return plantaService.readAll();
	}
	
	public void atualizar(int id) {
		plantaService.update(id);
	}
	
	public void deletar(int id) {
		plantaService.delete(id);
	}

}
