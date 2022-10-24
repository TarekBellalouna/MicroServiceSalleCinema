package com.example.centre.Service;

import java.util.List;

import com.example.centre.Entity.CentreCinema;



public interface CentreCinemaService {
	CentreCinema add(CentreCinema centreCinema);
	CentreCinema update(CentreCinema centreCinema, Long id);
    void delete(long id);
    List<CentreCinema> findAll();
    CentreCinema findById(Long id);
    
}
