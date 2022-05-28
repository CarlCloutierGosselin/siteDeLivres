package sitedelivres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Membre extends Utilisateur {

    private Date dateInscription;
    private String courriel;
    private String numeroTelephone;
    private String adresse;
    private int nbSignalements = 0;
    private StatutMembre statut;
    private Set<Signalement> signalements = new HashSet(0);
    private Set<Annonce> annonces = new HashSet(0);

    public Membre(Date dateInscription, String courriel, String numeroTelephone, String adresse, StatutMembre statut, String idUtilisateur, String motPasse, String nom, String prenom) {
        super(idUtilisateur, motPasse, nom, prenom);
        this.dateInscription = dateInscription;
        this.courriel = courriel;
        this.numeroTelephone = numeroTelephone;
        this.adresse = adresse;
        this.statut = statut;
    }

    public void publierAnnonce(Set<Description> descriptions, Set<Photo> photos) {
        Annonce nouvelleAnnonce = new Annonce(new Date(), StatutAnnonce.PUBLIEE, this);
        for (Description description : descriptions) {
            description.setAnnonce(nouvelleAnnonce);
        }
        
        for (Photo photo : photos) {
            photo.setAnnonce(nouvelleAnnonce);
        }
        
        nouvelleAnnonce.setPhotos(photos);
        annonces.add(nouvelleAnnonce);

    }

    public void signalerAnnonce() {

    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public StatutMembre getStatut() {
        return statut;
    }

    public void setStatut(StatutMembre statut) {
        this.statut = statut;
    }

    public int getNbSignalements() {
        return nbSignalements;
    }

    public void setNbSignalements(int nbSignalements) {
        this.nbSignalements = nbSignalements;
    }

    public Set<Signalement> getSignalements() {
        return signalements;
    }

    public void setSignalements(Set<Signalement> signalements) {
        this.signalements = signalements;
    }

    public Set<Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Set<Annonce> annonces) {
        this.annonces = annonces;
    }

    @Override
    public String toString() {
        return "Membre{" + "dateInscription=" + dateInscription + ", couriel=" + courriel + ", numeroTelephone=" + numeroTelephone + ", adresse=" + adresse + ", nbSignalements=" + nbSignalements + ", statut=" + statut + ", signalements=" + signalements + ", annonces=" + annonces + '}';
    }

}
