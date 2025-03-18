package com.adrar.sitecda.model;

import jakarta.persistence.*;

@Entity
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produit;
    @Column(length = 50, nullable = false, name="nom_produit")
    private String nom;
    @Column(length = 50, nullable = false, name="description")
    private String description;
    @Column(length = 50, nullable = false, name="prix")
    private Double price;


    public Produit() {
    }

    public Produit(String nom, String description, Double price) {
        this.nom = nom;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id_produit;
    }

    public void setId(Long id) {
        this.id_produit = id;
    }

    public String getNom() {return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
