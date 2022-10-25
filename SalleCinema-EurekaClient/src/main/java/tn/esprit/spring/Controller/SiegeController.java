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

import tn.esprit.spring.Entity.SalleCinema;
import tn.esprit.spring.Entity.Siege;

import tn.esprit.spring.Service.SiegeImpl;

@RestController
@RequestMapping("/siege/")
public class SiegeController {

	@Autowired
	private SiegeImpl siegeService ;
	
	
	@PostMapping("add")
    public Siege addSiege( @RequestBody Siege siege) {
        return siegeService.add(siege);
    }
    @PutMapping("update/{id}")
    public Siege updateSiege( @RequestBody Siege siege,@PathVariable("id") Long id) {
        return siegeService.update(siege, id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteSiege(@PathVariable("id") long id) {
    	siegeService.delete(id);
    }

    @GetMapping("list")
    public List<Siege> findAll() {
        return siegeService.findAll();
    }

    @GetMapping("findById/{id}")
    public Siege findByIdSiege(@PathVariable("id") Long id) {
        return siegeService.findById(id);
    }

}
