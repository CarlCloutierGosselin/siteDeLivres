package sitedelivres;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Administrateur extends Utilisateur {

    private int idAdministrateur;
    private Set<Signalement> signalements = new HashSet(0);
    private static int nbAdmin = 1;

    public Administrateur(String idUtilisateur, String motPasse, String nom, String prenom) {
        super(idUtilisateur, motPasse, nom, prenom);
        this.idAdministrateur = nbAdmin++;
    }

    public Administrateur() {
        this.idAdministrateur = nbAdmin++;
    }

    public int getIdAdministrateur() {
        return idAdministrateur;
    }

    public void setIdAdministrateur(int idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }

    public Set<Signalement> getSignalements() {
        return signalements;
    }

    public void setSignalements(Set<Signalement> signalements) {
        this.signalements = signalements;
    }

    public void desactiverVieillesAnnonces(Annonce annonce) {
        annonce.setStatut(StatutAnnonce.DESACTIVEE);
    }

    public void desactiverVieillesAnnonces(Date date) {
        Membre m = new Membre();
        Set<Annonce> as = m.getAnnonces();
        
        for(Annonce a : as) {
            if (a.getDatePublication().compareTo(date) <= 0) {
                a.setStatut(StatutAnnonce.DESACTIVEE);
            }
        }
    }

    @Override
    public String toString() {
        return "Administrateur{" + "idAdministrateur=" + idAdministrateur
                + ", signalements=" + signalements + '}';
    }

}
