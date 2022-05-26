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
    protected int motPasse;
    

    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(String idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(int motPasse) {
        this.motPasse = motPasse;
    }
    
    
}
