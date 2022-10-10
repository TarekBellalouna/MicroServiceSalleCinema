package tn.esprit.spring.Entity;

import java.util.List;



public interface ISalleCinemaService {
	SalleCinema add(SalleCinema salleCinema);
	SalleCinema update(SalleCinema salleCinema, Long id);
    void delete(long id);
    List<SalleCinema> findAll();
    SalleCinema findById(Long id);
}
