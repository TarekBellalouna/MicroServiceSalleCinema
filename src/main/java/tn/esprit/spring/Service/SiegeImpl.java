package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Entity.CentreCinema;
import tn.esprit.spring.Entity.Siege;
import tn.esprit.spring.Repo.SiegeRepository;

@Service
public class SiegeImpl implements IServiceSiege {

	@Autowired
	SiegeRepository siegeRepo ;
	
	@Override
	public Siege add(Siege siege) {
		// TODO Auto-generated method stub
		return siegeRepo.save(siege);
	}

	@Override
	public Siege update(Siege siege, Long id) {
		// TODO Auto-generated method stub
		if(siegeRepo.findById(id).isPresent()){
			Siege sc = siegeRepo.findById(id).get();
			sc.setPositon(siege.getPositon());
			sc.setType(siege.getType());
			sc.setSalle(siege.getSalle());
			
                       
            
            return siegeRepo.save(sc);
        }
        return null;
	}

	@Override
	public void delete(long id) {
		siegeRepo.deleteById(id);
		
	}

	@Override
	public List<Siege> findAll() {
		// TODO Auto-generated method stub
		return siegeRepo.findAll();
	}

	@Override
	public Siege findById(Long id) {
		// TODO Auto-generated method stub
		return siegeRepo.getById(id);
	}

}
