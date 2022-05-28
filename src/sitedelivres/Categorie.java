/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Categorie {

    private int noCategorie;
    private String nom;
    private Set<Livre> livres = new HashSet(0);
    private Set<Categorie> sousCategories = new HashSet(0);
    private Categorie categorieMere;
    
    private static int nombreCategorie = 1;

    public Categorie() {
        this.noCategorie = nombreCategorie++;
    }

    public Categorie(String nom) {
        this.noCategorie = nombreCategorie++;
        this.nom = nom;
    }

    public int getNoCategorieUnique() {
        return noCategorie;
    }

    public void setNoCategorieUnique(int noCategorieUnique) {
        this.noCategorie = noCategorieUnique;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    public Set<Categorie> getSousCategories() {
        return sousCategories;
    }

    public void setSousCategories(Set<Categorie> sousCategories) {
        this.sousCategories = sousCategories;
    }

    public Categorie getCategorieMere() {
        return categorieMere;
    }

    public void setCategorieMere(Categorie categorieMere) {
        this.categorieMere = categorieMere;
    }

    @Override
    public String toString() {
        return "Categorie{" + "noCategorieUnique=" + noCategorie + ", nom=" + nom + ", livres=" + livres + ", sousCategories=" + sousCategories + ", categorieMere=" + categorieMere.getNom() + '}';
    }

}
