package com.adrar.sitecda.model;

public class Produit {

    private String nom;
    private String description;
    private Double price;

    public Produit() {
    }

    public Produit(String nom, String description, Double price) {
        this.nom = nom;
        this.description = description;
        this.price = price;
    }

    public String getNom() {
        return nom;
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
