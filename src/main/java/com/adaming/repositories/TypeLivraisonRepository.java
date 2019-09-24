package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.TypeLivraison;

@Repository
public interface TypeLivraisonRepository extends JpaRepository<TypeLivraison,Long>{

}
