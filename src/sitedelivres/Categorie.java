package sitedelivres;

import java.util.HashSet;
import java.util.Set;

public class Categorie {

    private int noCategorie;
    private String nom;
    private Set<Livre> livres = new HashSet(0);
    private Set<Categorie> sousCategories = new HashSet(0);
    private Categorie categorieMere;
    private static int nbCategories = 0;

    public Categorie() {
        this.noCategorie = nbCategories++;
    }

    public Categorie(String nom) {
        this.noCategorie = nbCategories++;
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
        String resultat = "Categorie{" + "noCategorie=" + noCategorie
                + ", nom=" + nom;

        if (categorieMere != null) {
            resultat += ", categorie mère=" + categorieMere.getNom();
        }
        
        resultat += "\nTitre des livres associés:\n";
        for (Livre l : livres) {
            resultat += "\t" +l.getTitre() + "\n";
        }

        resultat += "\nNom des sous catégories:\n";
        for (Categorie c : sousCategories) {
            resultat += "\t" +c.getNom() + "\n";
        }

        return resultat + '}';
    }

}
