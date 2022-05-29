package sitedelivres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Annonce {

    private static int noAnnonce = 1;
    private Date datePublication;
    private StatutAnnonce statut;
    private Membre membre;

    private Set<Photo> photos = new HashSet(0);
    private Set<Signalement> signalements = new HashSet(0);

    public Annonce() {
        Annonce.noAnnonce = noAnnonce++;
    }

    public Annonce(Date datePublication, StatutAnnonce statut, Membre membre) {
        this.datePublication = datePublication;
        this.statut = statut;
        this.membre = membre;
        
        Annonce.noAnnonce = noAnnonce++;
    }

    public int getNoAnnonce() {
        return noAnnonce;
    }

    public void setNoAnnonce(int noAnnonce) {
        Annonce.noAnnonce = noAnnonce;
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

    @Override
    public String toString() {
        return "Annonce{" + "noAnnonceUnique=" + noAnnonce 
                + ", datePublication=" + datePublication 
                + ", statut=" + statut + ", membre=" + membre.getNom() 
                + ", photos=" + photos + ", signalements=" + signalements + '}';
    }

}
