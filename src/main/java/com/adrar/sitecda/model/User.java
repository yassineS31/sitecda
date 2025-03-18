package com.adrar.sitecda.model;


public class User {

    private String firstname;
    private String lastname;
    private Integer age;

    public User() {
    }

    public User(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getNom() {
        return firstname;
    }

    public void setNom(String firstname) {
        this.firstname = firstname;
    }

    public String getDescription() {
        return lastname;
    }

    public void setDescription(String lastname) {
        this.lastname = lastname;
    }

    public Integer getPrice() {
        return age;
    }

    public void setPrice(Integer age) {
        this.age = age;
    }
}
