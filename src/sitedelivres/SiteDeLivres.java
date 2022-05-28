/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sitedelivres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
        
        Categorie cat1 = new Categorie("Animaux de compagnie");
        
        Auteur auteur1 = new Auteur(5, "Woman", "Cat");
        
        Livre livre1 = new Livre(555, "How I met your kitten", "Cats", "Catnip society", cat1);
        Livre livre2 = new Livre(556, "Horrible dogs", "Dog's habbits", "Catnip society", cat1);
        
        Photo photo1 = new Photo(new Date(), "https://petitchatton.org/chatton109", null);
        Photo photo2 = new Photo(new Date(), "https://petitchien.gg/snoopdog", null);
        
        Description desc1 = new Description("Lamentable", 9.99f, "Étrange histoire de chat", null, livre1);
        Description desc2 = new Description("Neuf", 5.99f, "Une personne détestant vraiment les chiens...", null, livre2);
        
        Set<Photo> photos1 = new HashSet(0);
        photos1.add(photo1);
        photos1.add(photo2);
        
        Set<Description> descriptions1 = new HashSet(0);
        descriptions1.add(desc1);
        descriptions1.add(desc2);
        
        membre1.publierAnnonce(descriptions1, photos1);
        
        System.out.println(admin1);
        System.out.println(admin2);
        System.out.println(admin3);
        System.out.println(admin4);
        System.out.println(membre1);
        System.out.println(membre2);
        System.out.println(membre3);
        System.out.println(membre4);
        System.out.println(membre5);
        
        System.out.println(desc1.getAnnonce().getNoAnnonce() + " " + desc1.getLivre().getTitre());
        System.out.println(desc2.getAnnonce().getNoAnnonce() + " " + desc2.getLivre().getTitre());
    }

}
