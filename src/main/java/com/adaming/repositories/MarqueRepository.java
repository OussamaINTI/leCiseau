package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Marque;

@Repository
public interface MarqueRepository extends JpaRepository<Marque,Long>{

}
