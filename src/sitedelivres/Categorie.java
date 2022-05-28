package sitedelivres;

import java.util.HashSet;
import java.util.Set;

public class Categorie {

    private int noCategorie;
    private String nom;
    private Set<Livre> livres = new HashSet(0);
    private Set<Categorie> sousCategories = new HashSet(0);
    private Categorie categorieMere;
    
    private static int nbCategorie = 1;

    public Categorie() {
        this.noCategorie = nbCategorie++;
    }

    public Categorie(String nom) {
        this.noCategorie = nbCategorie++;
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
        return "Categorie{" + "noCategorieUnique=" + noCategorie + ", nom=" + nom + ", livres=" + livres + '}';
    }

}
