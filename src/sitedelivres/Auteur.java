/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carl
 */
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
