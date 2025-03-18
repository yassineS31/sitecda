package com.adrar.sitecda.model;

import jakarta.persistence.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false, name="nom_produit")
    private String nom;
    @Column(length = 50, nullable = false, name="description")
    private String description;
    @Column(length = 50, nullable = false, name="prix")
    private Double price;

    @ManyToOne()
    @JoinColumn(name="id")
    private Category category;


    public Produit() {
    }

    public Produit(String nom, String description, Double price) {
        this.nom = nom;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



}
