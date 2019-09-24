package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long>{

}
