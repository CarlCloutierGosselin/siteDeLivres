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
public class Cours {

    private String titre;
    private String sigle;
    private String description;
    private Set<Livre> livres = new HashSet(0);

    public Cours() {
    }

    public Cours(String titre, String sigle, String description) {
        this.titre = titre;
        this.sigle = sigle;
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Cours{" + "titre=" + titre + ", sigle=" + sigle + ", description=" + description + ", livres=" + livres + '}';
    }

}
