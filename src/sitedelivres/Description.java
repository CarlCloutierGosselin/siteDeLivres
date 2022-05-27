/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

/**
 *
 * @author Admin
 */
public class Description {

    private String etat;
    private float prix;
    private String resume;
    private Annonce annonce;
    private Livre livre;

    public Description() {
    }

    public Description(String etat, float prix, String resume, Annonce annonce, Livre livre) {
        this.etat = etat;
        this.prix = prix;
        this.resume = resume;
        this.annonce = annonce;
        this.livre = livre;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Description{" + "etat=" + etat + ", prix=" + prix + ", resume=" + resume + ", annonce=" + annonce + ", livre=" + livre + '}';
    }

}
