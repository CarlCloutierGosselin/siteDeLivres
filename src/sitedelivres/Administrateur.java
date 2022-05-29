package sitedelivres;

import java.util.HashSet;
import java.util.Set;

public class Administrateur extends Utilisateur {

    private static int idAdministrateur = 1;
    private Set<Signalement> signalements = new HashSet(0);

    public Administrateur(String idUtilisateur, String motPasse, String nom, String prenom) {
        super(idUtilisateur, motPasse, nom, prenom);
        Administrateur.idAdministrateur = idAdministrateur++;
    }

    public Administrateur() {
        Administrateur.idAdministrateur = idAdministrateur++;
    }

    public int getIdAdministrateur() {
        return idAdministrateur;
    }

    public void setIdAdministrateur(int idAdministrateur) {
        Administrateur.idAdministrateur = idAdministrateur;
    }

    public Set<Signalement> getSignalements() {
        return signalements;
    }

    public void setSignalements(Set<Signalement> signalements) {
        this.signalements = signalements;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "idAdministrateur=" + idAdministrateur 
                + ", signalements=" + signalements + '}';
    }

}
