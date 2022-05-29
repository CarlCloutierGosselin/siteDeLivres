package sitedelivres;

import java.util.HashSet;
import java.util.Set;

public class Auteur extends Personne {

    private int note;
    private Set<Livre> bibliographie = new HashSet(0);

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

    public Set<Livre> getBibliographie() {
        return bibliographie;
    }

    public void setBibliographie(Set<Livre> Bibliographie) {
        this.bibliographie = Bibliographie;
    }

    @Override
    public String toString() {
        String resultat = "Auteur{" + "nom=" + nom + ", note=" + note + "\nBibliographie: \n";
        for (Livre l : bibliographie){
            resultat += "\t" +l.getTitre() + "\n";
        }
        
        return resultat += '}';
    }

}
