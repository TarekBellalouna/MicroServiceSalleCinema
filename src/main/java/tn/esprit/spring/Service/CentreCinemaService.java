package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.Entity.CentreCinema;
import tn.esprit.spring.Entity.SalleCinema;

public interface CentreCinemaService {
	CentreCinema add(CentreCinema centreCinema);
	CentreCinema update(CentreCinema centreCinema, Long id);
    void delete(long id);
    List<CentreCinema> findAll();
    CentreCinema findById(Long id);
    
}
