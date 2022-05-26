/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

/**
 *
 * @author Carl
 */
public class Administrateur extends Utilisateur{
    private int idAdministrateur;

    public Administrateur() {
    }

    public Administrateur(int idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }
    

    public int getIdAdministrateur() {
        return idAdministrateur;
    }

    public void setIdAdministrateur(int idAdministrateur) {
        this.idAdministrateur = idAdministrateur;
    }
    
    
}
