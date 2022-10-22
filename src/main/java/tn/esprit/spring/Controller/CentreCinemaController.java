package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entity.CentreCinema;
import tn.esprit.spring.Entity.SalleCinema;
import tn.esprit.spring.Service.CentreCinemaImpl;
import tn.esprit.spring.Service.SalleCinemaImpl;

@RestController
@RequestMapping("/centre/")
public class CentreCinemaController {

	@Autowired
	private CentreCinemaImpl centreCinemaService ;
	
	@PostMapping("add")
    public CentreCinema addCentre( @RequestBody CentreCinema centre) {
        return centreCinemaService.add(centre);
    }
    @PutMapping("update/{id}")
    public CentreCinema updateCentre( @RequestBody CentreCinema centre,@PathVariable("id") Long id) {
        return centreCinemaService.update(centre, id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteCentre(@PathVariable("id") long id) {
    	centreCinemaService.delete(id);
    }

    @GetMapping("list")
    public List<CentreCinema> findAll() {
        return centreCinemaService.findAll();
    }

    @GetMapping("findById/{id}")
    public CentreCinema findByIdCentre(@PathVariable("id") Long id) {
        return centreCinemaService.findById(id);
    }

}
