package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays,Long>{

}
