/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

/**
 *
 * @author Admin
 */
public class Categorie {

    private int noCategorieUnique;
    private String nom;

    public Categorie() {
    }

    public Categorie(int noCategorieUnique, String nom) {
        this.noCategorieUnique = noCategorieUnique;
        this.nom = nom;
    }

    public int getNoCategorieUnique() {
        return noCategorieUnique;
    }

    public void setNoCategorieUnique(int noCategorieUnique) {
        this.noCategorieUnique = noCategorieUnique;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
