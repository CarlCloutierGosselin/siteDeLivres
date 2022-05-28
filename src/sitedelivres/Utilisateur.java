package sitedelivres;

public class Utilisateur extends Personne {

    protected String idUtilisateur;
    protected String motPasse;
    protected boolean estAuthentifie = false;

    public Utilisateur() {
    }

    public Utilisateur(String idUtilisateur, String motPasse) {
        this.idUtilisateur = idUtilisateur;
        this.motPasse = motPasse;
    }

    public Utilisateur(String idUtilisateur, String motPasse, String nom, String prenom) {
        super(nom, prenom);
        this.idUtilisateur = idUtilisateur;
        this.motPasse = motPasse;
    }
    
    public void authentifier(String idUtilisateur, String motDePasse){
        if (idUtilisateur == this.idUtilisateur && motDePasse == this.motPasse)
            estAuthentifie = true;
    }
    
    public void deconnection(){
        estAuthentifie = false;
    }

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "idUtilisateur=" + idUtilisateur + ", motPasse=" + motPasse + '}';
    }

}
