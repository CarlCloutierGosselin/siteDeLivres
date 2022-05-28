package sitedelivres;

import java.util.HashSet;
import java.util.Set;

public class Auteur extends Personne {

    private int note;
    private Set<Livre> livres = new HashSet(0);

    public Auteur() {
    }

    public Auteur(int note, String nom, String prenom) {
        super(nom, prenom);
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Auteur{" + "nom=" + getNom() + ", note=" + note + '}';
    }

}
