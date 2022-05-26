/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carl
 */
public class Administrateur extends Utilisateur{
    private int idAdministrateur;
    private Set<Signalement>signalements=new HashSet(0);
    

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

    public Set<Signalement> getSignalements() {
        return signalements;
    }

    public void setSignalements(Set<Signalement> signalements) {
        this.signalements = signalements;
    }
    
    
}
