package com.example.centre.Repositroy;

import org.springframework.stereotype.Repository;

import com.example.centre.Entity.CentreCinema;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CentreCinemaRepository extends JpaRepository<CentreCinema,Long> {

}
