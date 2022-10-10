package tn.esprit.spring.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SalleCinemaImpl implements ISalleCinemaService {
 
	@Autowired
	private SalleCinemaRepository salleCinemaRepo ;
	
	@Override
	public SalleCinema add(SalleCinema salleCinema) {
		// TODO Auto-generated method stub
		return salleCinemaRepo.save(salleCinema);
	}

	@Override
	public SalleCinema update(SalleCinema salleCinema, Long id) {
		if(salleCinemaRepo.findById(id).isPresent()){
			SalleCinema cl = salleCinemaRepo.findById(id).get();
            cl.setNom(salleCinema.getNom());
            cl.setLieu(salleCinema.getLieu());
            cl.setIdCentre(salleCinema.getIdCentre());
           
            
            return salleCinemaRepo.save(cl);
        }
        return null;
    
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		salleCinemaRepo.deleteById(id);
	}

	@Override
	public List<SalleCinema> findAll() {
		// TODO Auto-generated method stub
		return salleCinemaRepo.findAll();
	}

	@Override
	public SalleCinema findById(Long id) {
		// TODO Auto-generated method stub
		return salleCinemaRepo.getById(id);
	}

}
