package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.TypePrestation;

@Repository
public interface TypePrestationRepository extends JpaRepository<TypePrestation,Long>{

}
