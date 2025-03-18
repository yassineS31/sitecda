package com.adrar.sitecda.model;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libele;


    // Constructeurs

    public Category() {};
    public Category(Long id, String libele) {
        this.id = id;
        this.libele = libele;
    }


    // Getters et Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    //Méthodes

}
