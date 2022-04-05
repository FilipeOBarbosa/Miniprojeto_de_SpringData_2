package br.edu.dac.filipe.projetojpa.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.dac.filipe.projetojpa.model.dao.FazendeiroDAO;
import br.edu.dac.filipe.projetojpa.model.entity.Fazendeiro;

@Service
public class FazendeiroService {

	@Autowired
	private FazendeiroDAO fazendeiroDAO;
	
	@Autowired
	private UpdateService updateService;
	
	public void create(Fazendeiro fazendeiro) {
		fazendeiroDAO.save(fazendeiro);
	}
	
	public Fazendeiro read(String cpf) {
		return fazendeiroDAO.findById(cpf).orElse(null);
	}
	
	public List<Fazendeiro> readAll(){
		return (List<Fazendeiro>) fazendeiroDAO.findAll();
	}
	
	public void update(String cpf) {
		updateService.update(fazendeiroDAO.findById(cpf).orElse(null));
	}
	
	public void delete(String cpf) {
		fazendeiroDAO.deleteById(cpf);
	}
	
}
