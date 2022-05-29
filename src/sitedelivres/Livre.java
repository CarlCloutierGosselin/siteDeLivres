package sitedelivres;

import java.util.HashSet;
import java.util.Set;

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

    public void ajouterAuteur(Auteur auteur){
        auteurs.add(auteur);
        auteur.getBibliographie().add(this);
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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        if (this.categorie != null){
            categorie.getLivres().remove(this);
        }
        this.categorie = categorie;
        categorie.getLivres().add(this);
    }

    @Override
    public String toString() {
        String resultat = "Livre{" + "isbn=" + isbn + ", titre=" + titre
                + ", sujet=" + sujet + ", editeur=" + editeur
                + ", categorie=" + categorie.getNom();

        resultat += "\n Sigle des cours associes \n";
        for (Cours c : cours) {
            resultat += "\t" + c.getSigle() + "\n";
        }

        return resultat + '}';
    }

    public void ajouterCours(Cours cours) {
        this.cours.add(cours);
        cours.getLivres().add(this);
    }

}
