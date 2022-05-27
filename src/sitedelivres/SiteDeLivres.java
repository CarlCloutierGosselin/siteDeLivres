/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sitedelivres;

import java.util.Date;

/**
 *
 * @author Carl
 */
public class SiteDeLivres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrateur admin1 = new Administrateur("admin001","qwerty", "Poitra", "Robert");
        Administrateur admin2 = new Administrateur("admin002","12345", "Wayne", "Bruce");
        Administrateur admin3 = new Administrateur("admin003","love", "Password", "Login");
        Administrateur admin4 = new Administrateur("admin004","admin", "Admin", "Admin");
        
        Membre membre1 = new Membre(new Date(), "courrier@gman.org", "8195551234", "123 fake street Dudeswell", StatutMembre.ACTIF, "heman", "123", "Haffett", "Bob");
        Membre membre2 = new Membre(new Date(), "fatiguant@gman.org", "8195556666", "1 real street Montsureal", StatutMembre.ACTIF, "shewoman", "qwerty", "Hann", "Anne");
        Membre membre3 = new Membre(new Date(), "tannant@gman.org", "5145556789", "3 weird street Quebec", StatutMembre.ACTIF, "transman", "cis", "Duran", "Duran");
        Membre membre4 = new Membre(new Date(), "intense@universitedelavie.gg", "4505559999", "666 hell street", StatutMembre.ACTIF, "transwoman", "arcenciel", "Dion", "Celine");
        Membre membre5 = new Membre(new Date(), "pasdfond@hostmall.org", "5145552222", "123 habitant street", StatutMembre.ACTIF, "thebestofthebestofthebest", "111", "Hilter", "Aldof");
        
        System.out.println(admin1);
        System.out.println(membre1);
    }

}
