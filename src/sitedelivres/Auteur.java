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

    private String note;
    private String bibliographie;
    private Set<Livre> livres = new HashSet(0);

    public Auteur() {
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getBibliographie() {
        return bibliographie;
    }

    public void setBibliographie(String bibliographie) {
        this.bibliographie = bibliographie;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

}
