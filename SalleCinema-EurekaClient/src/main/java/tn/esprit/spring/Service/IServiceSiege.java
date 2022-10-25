package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.Entity.Siege;

public interface IServiceSiege {
	Siege add(Siege siege);
	Siege update(Siege siege, Long id);
    void delete(long id);
    List<Siege> findAll();
    Siege findById(Long id);
}
