package com.example.centre.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.centre.Entity.CentreCinema;
import com.example.centre.Repositroy.CentreCinemaRepository;



@Service
public class CentreCinemaImpl implements CentreCinemaService{
	
	@Autowired
	private CentreCinemaRepository centreCinemaRepo ;
	
	@Override
	public CentreCinema add(CentreCinema centreCinema) {
		// TODO Auto-generated method stub
		return centreCinemaRepo.save(centreCinema);
	}

	@Override
	public CentreCinema update(CentreCinema centreCinema, Long id) {
		if(centreCinemaRepo.findById(id).isPresent()){
			CentreCinema sc = centreCinemaRepo.findById(id).get();
			sc.setNom(centreCinema.getNom());
			sc.setLieu(centreCinema.getLieu());
			sc.setTel(centreCinema.getTel());
			//sc.setSalleCinemas(centreCinema.getSalleCinemas());
			
                       
            
            return centreCinemaRepo.save(sc);
        }
        return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		centreCinemaRepo.deleteById(id);
	}

	@Override
	public List<CentreCinema> findAll() {
		return centreCinemaRepo.findAll();
	}

	@Override
	public CentreCinema findById(Long id) {
		// TODO Auto-generated method stub
		return centreCinemaRepo.getById(id);
	}

}
