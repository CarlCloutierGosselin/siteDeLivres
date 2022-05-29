package sitedelivres;

import java.util.HashSet;
import java.util.Set;

public class Categorie {

    private static int noCategorie = 1;
    private String nom;
    private Set<Livre> livres = new HashSet(0);
    private Set<Categorie> sousCategories = new HashSet(0);
    private Categorie categorieMere;

    public Categorie() {
        Categorie.noCategorie = noCategorie++;
    }

    public Categorie(String nom) {
        Categorie.noCategorie = noCategorie++;
        this.nom = nom;
    }

    public int getNoCategorie() {
        return noCategorie;
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
        categorieMere.getSousCategories().add(this);
    }

    @Override
    public String toString() {
        return "Categorie{" + "noCategorie=" + noCategorie 
                + ", nom=" + nom + ", livres=" + livres + '}';
    }

}
