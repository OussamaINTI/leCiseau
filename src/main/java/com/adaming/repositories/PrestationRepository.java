package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Prestation;

@Repository
public interface PrestationRepository extends JpaRepository<Prestation,Long>{

}
