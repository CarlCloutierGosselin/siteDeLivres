package sitedelivres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Membre extends Utilisateur {

    private Date dateInscription;
    private String courriel;
    private String noTelephone;
    private String adresse;
    private int nbSignalements = 0;
    private StatutMembre statut;
    private Set<Signalement> signalements = new HashSet(0);
    private Set<Annonce> annonces = new HashSet(0);

    public Membre(Date dateInscription, String courriel, String noTelephone, String adresse, StatutMembre statut, String idUtilisateur, String motPasse, String nom, String prenom) {
        super(idUtilisateur, motPasse, nom, prenom);
        this.dateInscription = dateInscription;
        this.courriel = courriel;
        this.noTelephone = noTelephone;
        this.adresse = adresse;
        this.statut = statut;
    }

    public Annonce publierAnnonce(Set<Description> descriptions, Set<Photo> photos) {
        if (!this.estAuthentifie) {
            System.out.println("Le membre doit être authentifié pour effectuer une publication");
            return null;
        }

        Annonce nouvelleAnnonce = new Annonce(new Date(), StatutAnnonce.PUBLIEE, this);
        for (Description description : descriptions) {
            description.setAnnonce(nouvelleAnnonce);
        }

        for (Photo photo : photos) {
            photo.setAnnonce(nouvelleAnnonce);
        }

        nouvelleAnnonce.setPhotos(photos);
        annonces.add(nouvelleAnnonce);
        
        return nouvelleAnnonce;
    }

    public Signalement signalerAnnonce(Annonce annonce, String objet) {
        if (!this.estAuthentifie) {
            System.out.println("Le membre doit être authentifié pour signaler une annonce");
            return null;
        }
        
        Signalement signalement = new Signalement(new Date(), objet, null, annonce, null, annonce.getMembre());
        annonce.getSignalements().add(signalement);
        
        annonce.getMembre().ajouterSignalement();
        
        return signalement;
    }

    public ExperienceClient commenterExperienceUtilisateur(int noteLivre, int noteVendeur, String commentaire, Annonce annonce){
        if (!this.estAuthentifie) {
            System.out.println("Le membre doit être authentifié pour commenter une experience client");
            return null;
        }
        
        ExperienceClient experienceClient = new ExperienceClient(noteLivre, noteVendeur, commentaire, new Date(), this, annonce, true);
        
        return experienceClient;
    }
    
    public void ajouterSignalement(){
        nbSignalements++;
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
        return noTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.noTelephone = numeroTelephone;
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
        return "Membre{" + "dateInscription=" + dateInscription + ", couriel=" + courriel + ", numeroTelephone=" + noTelephone + ", adresse=" + adresse + ", nbSignalements=" + nbSignalements + ", statut=" + statut + ", signalements=" + signalements + ", annonces=" + annonces + '}';
    }

}
