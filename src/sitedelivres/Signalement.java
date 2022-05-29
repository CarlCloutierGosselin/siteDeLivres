package sitedelivres;

import java.util.Date;

public class Signalement {

    private int idSignalement;
    private Date dateSignalement;
    private String objet;
    private String conclusion;
    private Administrateur administrateur;
    private Annonce annonce;
    private Membre membre;
    
    private static int nbSignalements = 1;

    public Signalement() {
        this.idSignalement = nbSignalements++;
    }

    public Signalement(Date dateSignalement, String objet, String conclusion, Annonce annonce, Administrateur administrateur, Membre membre) {
        this.idSignalement = nbSignalements++;
        this.dateSignalement = dateSignalement;
        this.objet = objet;
        this.conclusion = conclusion;
        this.annonce = annonce;
        this.membre = membre;
    }

    public int getIdSignalement() {
        return idSignalement;
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

    @Override
    public String toString() {
        return "Signalement{" + "idSignalement=" + idSignalement 
                + ", dateSignalement=" + dateSignalement + ", objet=" + objet 
                + ", conclusion=" + conclusion + ", annonce=" + annonce.getNoAnnonce() 
                + ", membre=" + membre.getNom() + '}';
    }

}
