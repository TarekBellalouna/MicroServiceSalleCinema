package tn.esprit.spring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.SalleCinema;

@Repository
public interface SalleCinemaRepository extends JpaRepository<SalleCinema, Long> {

}
