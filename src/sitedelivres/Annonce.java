/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Annonce {

    private int noAnnonceUnique;
    private Date datePublication;
    private StatutAnnonce statut;
    private Membre membre;

    private Set<Photo> photos = new HashSet(0);
    private Set<Signalement> signalements = new HashSet(0);

    public Annonce() {
    }

    public Annonce(int noAnnonceUnique, Date datePublication, StatutAnnonce statut, Membre membre) {
        this.noAnnonceUnique = noAnnonceUnique;
        this.datePublication = datePublication;
        this.statut = statut;
        this.membre = membre;
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

    public StatutAnnonce getStatut() {
        return statut;
    }

    public void setStatut(StatutAnnonce statut) {
        this.statut = statut;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    public Set<Signalement> getSignalements() {
        return signalements;
    }

    public void setSignalements(Set<Signalement> signalements) {
        this.signalements = signalements;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

}
