package tn.esprit.spring.Repo;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.CentreCinema;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CentreCinemaRepository extends JpaRepository<CentreCinema,Long> {

}
