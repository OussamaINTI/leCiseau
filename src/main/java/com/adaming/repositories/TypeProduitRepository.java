package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.TypeProduit;

@Repository
public interface TypeProduitRepository extends JpaRepository<TypeProduit,Long>{

}
