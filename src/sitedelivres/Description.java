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

    public Description() {
    }

    public Description(String etat, float prix, String resume) {
        this.etat = etat;
        this.prix = prix;
        this.resume = resume;
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

    
}
