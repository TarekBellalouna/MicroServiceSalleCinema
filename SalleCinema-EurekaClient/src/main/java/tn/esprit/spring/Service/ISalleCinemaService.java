package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.Entity.SalleCinema;



public interface ISalleCinemaService {
	SalleCinema add(SalleCinema salleCinema);
	SalleCinema update(SalleCinema salleCinema, Long id);
    void delete(long id);
    List<SalleCinema> findAll();
    SalleCinema findById(Long id);
    void assignSalleToCentre(Long idSalle, Long idCentre);
}
