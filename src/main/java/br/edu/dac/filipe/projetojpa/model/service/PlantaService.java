package br.edu.dac.filipe.projetojpa.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.dac.filipe.projetojpa.model.dao.PlantaDAO;
import br.edu.dac.filipe.projetojpa.model.entity.Planta;


@Service
public class PlantaService {
	
	@Autowired
	private PlantaDAO plantadao;
	
	@Autowired
	private PlantaUpdateService plantaUpdateService;

	public void create(Planta planta) {
		plantadao.save(planta);
	}
	
	public Planta read(int id) {
		return plantadao.findById(id).orElse(null);
	}
	
	public List<Planta> readAll(){
		return (List<Planta>) plantadao.findAll();
	}
	
	public void update(int id) {
		plantaUpdateService.updatePlant(plantadao.findById(id).orElse(null));
	}
	
	public void delete(int id) {
		plantadao.deleteById(id);
	}
	
}
