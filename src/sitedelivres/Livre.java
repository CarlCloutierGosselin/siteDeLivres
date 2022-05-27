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
public class Livre {

    private int isbn;
    private String titre;
    private String sujet;
    private String editeur;
    private Categorie categorie;
    private Set<Auteur> auteurs = new HashSet(0);
    private Set<Cours> cours = new HashSet(0);

    public Livre() {
    }

    public Livre(int isbn, String titre, String sujet, String editeur, Categorie categorie) {
        this.isbn = isbn;
        this.titre = titre;
        this.sujet = sujet;
        this.editeur = editeur;
        this.categorie = categorie;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public Set<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(Set<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

    public Set<Cours> getCours() {
        return cours;
    }

    public void setCours(Set<Cours> cours) {
        this.cours = cours;
    }

}
