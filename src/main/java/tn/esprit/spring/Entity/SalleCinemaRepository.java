package tn.esprit.spring.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleCinemaRepository extends JpaRepository<SalleCinema, Long> {

}
