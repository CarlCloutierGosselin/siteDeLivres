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
 * @author Carl
 */
public class Membre extends Utilisateur {

    private Date dateInscription;
    private String couriel;
    private int numeroTelephone;
    private String adresse;
    private int nbSignalements;
    private StatutMembre statut;
    private Set<Signalement> signalements = new HashSet(0);
    private Set<Annonce> annonces = new HashSet(0);

    public Membre(Date dateInscription, String couriel, int numeroTelephone, String adresse, int nbSignalements, StatutMembre statut, String idUtilisateur, int motPasse, String nom, String prenom) {
        super(idUtilisateur, motPasse, nom, prenom);
        this.dateInscription = dateInscription;
        this.couriel = couriel;
        this.numeroTelephone = numeroTelephone;
        this.adresse = adresse;
        this.nbSignalements = nbSignalements;
        this.statut = statut;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getCouriel() {
        return couriel;
    }

    public void setCouriel(String couriel) {
        this.couriel = couriel;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(int numeroTelephone) {
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
        return "Membre{" + "dateInscription=" + dateInscription + ", couriel=" + couriel + ", numeroTelephone=" + numeroTelephone + ", adresse=" + adresse + ", nbSignalements=" + nbSignalements + ", statut=" + statut + ", signalements=" + signalements + ", annonces=" + annonces + '}';
    }

}
