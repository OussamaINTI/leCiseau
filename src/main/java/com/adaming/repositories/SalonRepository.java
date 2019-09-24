package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Salon;

@Repository
public interface SalonRepository extends JpaRepository<Salon,Long>{

}
