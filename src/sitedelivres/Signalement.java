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
public class Signalement {
    private int idSignalement;
    private Date dateSignalement;
    private String objet;
    private String conclusion;
    private Administrateur administrateur;
    private Annonce annonce;
    private Membre membre;
    
    

    public Signalement() {
    }

    public Signalement(int idSignalement, Date dateSignalement, String objet, String conclusion,Annonce annonce,Administrateur administrateur) {
        this.idSignalement = idSignalement;
        this.dateSignalement = dateSignalement;
        this.objet = objet;
        this.conclusion = conclusion;
        this.annonce = annonce;
    }
    
    

    public int getIdSignalement() {
        return idSignalement;
    }

    public void setIdSignalement(int idSignalement) {
        this.idSignalement = idSignalement;
    }

    public Date getDateSignalement() {
        return dateSignalement;
    }

    public void setDateSignalement(Date dateSignalement) {
        this.dateSignalement = dateSignalement;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }
 
}
