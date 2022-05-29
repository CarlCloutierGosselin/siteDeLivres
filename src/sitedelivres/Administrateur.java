package sitedelivres;

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

        for (Annonce a : as) {
            if (a.getDatePublication().compareTo(date) <= 0) {
                a.setStatut(StatutAnnonce.DESACTIVEE);
            }
        }
    }

    public void publierAnnonce(Set<Description> descriptions, Set<Photo> photos) {
        Membre m = new Membre();
        m.publierAnnonce(descriptions, photos);
    }

    public void modifierAnnonce(Annonce annonce, Set<Photo> photos) {
        Membre m = new Membre();
        m.modifierAnnonce(annonce, photos);
    }

    public void modifierAnnonce(Description description, String etat, float prix, String resume) {
        Membre m = new Membre();
        m.modifierAnnonce(description, etat, prix, resume);
    }

    public Categorie ajouterCategorie(Categorie cat) {
        if (!this.estAuthentifie) {
            System.out.println("Authentification necessaire pour ajouter une categorie");
            return null;
        } else if (this.getIdAdministrateur() != 0) {
            System.out.println("Doit être administrateur pour ajouter une categorie");
            return null;
        }
        return new Categorie(cat.getNom());
    }

    public Categorie desactiverCategorie(Categorie cat) {
        if (!this.estAuthentifie) {
            System.out.println("Authentification necessaire pour desactiver une categorie");
            return null;
        } else if (this.getIdAdministrateur() != 0) {
            System.out.println("Doit être administrateur pour desactiver une categorie");
            return null;
        }

        for (Categorie c : cat.getSousCategories()) {
            if (c.getNom().contains(cat.getNom())) {
                c.setNom(null);
            }
        }
        cat.setCategorieMere(null);

        return cat;
    }

    public Membre ajouterMembre(Membre m) {
        if (!this.estAuthentifie) {
            System.out.println("Authentification necessaire pour desactiver une categorie");
            return null;
        } else if (this.getIdAdministrateur() != 0) {
            System.out.println("Doit être administrateur pour desactiver une categorie");
            return null;
        }
        return new Membre(m.getDateInscription(), m.getCourriel(), m.getNumeroTelephone(),
                m.getAdresse(), m.getStatut(), m.getIdUtilisateur(),
                m.getMotPasse(), m.getNom(), m.getPrenom());
    }

    public void consulterSignalements() {
        if (!this.estAuthentifie) {
            System.out.println("Authentification necessaire pour consulter les signalements");
        } 
        
        if (getIdAdministrateur() > 0) {
            Membre m = new Membre();
            for(Signalement s : m.getSignalements())
                System.out.println("Signalement: " + s.getIdSignalement());
        } else {
            System.out.println(getIdAdministrateur());
            System.out.println("Doit etre administrateur pour consulter les signalements");
            
        }
    }

    @Override
    public String toString() {
        return "Administrateur{" + "idAdministrateur=" + idAdministrateur
                + ", signalements=" + signalements + '}';
    }

}
