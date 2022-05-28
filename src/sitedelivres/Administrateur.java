package sitedelivres;

import java.util.HashSet;
import java.util.Set;

public class Administrateur extends Utilisateur {

    private int idAdministrateur;
    private Set<Signalement> signalements = new HashSet(0);
    private static int nombreAdmin = 1;

    public Administrateur(String idUtilisateur, String motPasse, String nom, String prenom) {
        super(idUtilisateur, motPasse, nom, prenom);
        this.idAdministrateur = nombreAdmin++;
    }

    public Administrateur() {
        this.idAdministrateur = nombreAdmin++;
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

    @Override
    public String toString() {
        return "Administrateur{" + "idAdministrateur=" + idAdministrateur + ", signalements=" + signalements + '}';
    }

}
