package br.edu.dac.filipe.projetojpa.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.edu.dac.filipe.projetojpa.model.entity.Planta;

@Repository
public interface PlantaDAO extends PagingAndSortingRepository<Planta, Integer>{
	

}
