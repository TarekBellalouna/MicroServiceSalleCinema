package tn.esprit.spring.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entity.SalleCinema;
import tn.esprit.spring.Service.SalleCinemaImpl;


@RestController
@RequestMapping("/salle/")
public class SalleCinemaController {

	@Autowired
	private SalleCinemaImpl salleCinemaService ;
	
	@PostMapping("add")
    public SalleCinema add( @RequestBody SalleCinema salleCinema) {
        return salleCinemaService.add(salleCinema);
    }
    @PutMapping("update/{id}")
    public SalleCinema update( @RequestBody SalleCinema client,@PathVariable("id") Long id) {
        return salleCinemaService.update(client, id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") long id) {
    	salleCinemaService.delete(id);
    }

    @GetMapping("list")
    public List<SalleCinema> findAll() {
        return salleCinemaService.findAll();
    }

    @GetMapping("findById/{id}")
    public SalleCinema findById(@PathVariable("id") Long id) {
        return salleCinemaService.findById(id);
    }

}
