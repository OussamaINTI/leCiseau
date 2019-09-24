package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long>{

}
