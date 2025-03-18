package com.adrar.sitecda.controller;

import com.adrar.sitecda.model.Produit;
import com.adrar.sitecda.service.ProduitService;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final ProduitService produitService;

    public HomeController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("firstname", "Mathieu");
        return "index";
    }

    @GetMapping("/produit")
    public String produit(Model model) {
        Produit produit = new Produit("Livre", "Livre de 50 pages", 14.99);
        model.addAttribute("produit", produit);
        return "produit";
    }

    @GetMapping("/helloworld/{firstname}")
    public String helloworldFirstname(Model model, @PathVariable String firstname) {
        model.addAttribute("prenom", firstname);
        return "hellofirstname";
    }


    // Méthode qui va afficher le template d'un produit en fonction de son Id :
    @GetMapping("/produit/{id}")
    public String produit(Model model, @PathVariable long id) {
        Produit produit = produitService.getById(id).get();
        model.addAttribute("produit", produit);
        return "produit";
    }
}
