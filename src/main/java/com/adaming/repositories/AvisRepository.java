package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Avis;

@Repository
public interface AvisRepository extends JpaRepository<Avis,Long>{

}
