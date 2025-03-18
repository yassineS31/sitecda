package com.adrar.sitecda.service;

import com.adrar.sitecda.model.Produit;
import com.adrar.sitecda.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {
    @Autowired
    private static ProduitRepository produitRepository;

    //Méthode qui trouve un produit via son id
    public Optional<Produit> getById(Long id){

        return produitRepository.findById(id);
    }

    // Méthode qui récupère tout les produits :
    public Iterable<Produit> getAll(){
        return produitRepository.findAll();  }

    public static Produit saveProduit(Produit produit){
        return  produitRepository.save(produit);
    };

}
