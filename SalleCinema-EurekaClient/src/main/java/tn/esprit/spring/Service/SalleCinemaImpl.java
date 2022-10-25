package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.Entity.SalleCinema;

import tn.esprit.spring.Repo.SalleCinemaRepository;

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
			SalleCinema sc = salleCinemaRepo.findById(id).get();
			sc.setNom(salleCinema.getNom());
			sc.setLieu(salleCinema.getLieu());
			sc.setSieges(salleCinema.getSieges());
			//sc.setCentre(salleCinema.getCentre());
                       
            
            return salleCinemaRepo.save(sc);
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

	@Override
	public void assignSalleToCentre(Long idSalle, Long idCentre) {
		// TODO Auto-generated method stub
		SalleCinema salle = salleCinemaRepo.getById(idSalle);
        //salle.setCentre(centreCinemaRepo.getById(idCentre));
        salleCinemaRepo.save(salle);
		
	}

}
