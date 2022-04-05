package br.edu.dac.filipe.projetojpa.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.dac.filipe.projetojpa.model.entity.Fazendeiro;

@Repository
public interface FazendeiroDAO extends PagingAndSortingRepository<Fazendeiro, String>{




}
