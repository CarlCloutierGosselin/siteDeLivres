/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

/**
 *
 * @author Carl
 */
public class Utilisateur extends Personne {

    protected String idUtilisateur;
    protected String motPasse;

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
