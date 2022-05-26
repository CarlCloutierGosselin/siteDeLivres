/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Annonce {
    private int noAnnonceUnique;
    private Date datePublication;
    private String statut;

    public Annonce() {
    }

    public Annonce(int noAnnonceUnique, Date datePublication, String statut) {
        this.noAnnonceUnique = noAnnonceUnique;
        this.datePublication = datePublication;
        this.statut = statut;
    }
    
    

    public int getNoAnnonceUnique() {
        return noAnnonceUnique;
    }

    public void setNoAnnonceUnique(int noAnnonceUnique) {
        this.noAnnonceUnique = noAnnonceUnique;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    
}
