package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Livraison;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison,Long>{

}
