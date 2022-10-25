package tn.esprit.spring.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.SalleCinema;
import tn.esprit.spring.Entity.Siege;

@Repository
public interface SiegeRepository extends JpaRepository<Siege, Long> {
	
}
