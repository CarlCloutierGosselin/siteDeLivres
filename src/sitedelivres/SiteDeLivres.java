package sitedelivres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SiteDeLivres {

    public static void main(String[] args) {
        Set<ExperienceClient> experiencesClient = new HashSet(0);
        
        Administrateur admin1 = new Administrateur("admin001", "qwerty", "Poitra", "Robert");
        Administrateur admin2 = new Administrateur("admin002", "12345", "Wayne", "Bruce");
        Administrateur admin3 = new Administrateur("admin003", "love", "Password", "Login");
        Administrateur admin4 = new Administrateur("admin004", "admin", "Admin", "Admin");

        Membre membre1 = new Membre(new Date(), "courrier@gman.org", "8195551234", "123 fake street Dudeswell", StatutMembre.ACTIF, "heman", "123", "Haffett", "Bob");
        Membre membre2 = new Membre(new Date(), "fatiguant@gman.org", "8195556666", "1 real street Montsureal", StatutMembre.ACTIF, "shewoman", "qwerty", "Hann", "Anne");
        Membre membre3 = new Membre(new Date(), "tannant@gman.org", "5145556789", "3 weird street Quebec", StatutMembre.ACTIF, "transman", "cis", "Duran", "Duran");
        Membre membre4 = new Membre(new Date(), "intense@universitedelavie.gg", "4505559999", "666 hell street", StatutMembre.ACTIF, "transwoman", "arcenciel", "Dion", "Celine");
        Membre membre5 = new Membre(new Date(), "pasdfond@hostmall.org", "5145552222", "123 habitant street", StatutMembre.ACTIF, "thebestofthebestofthebest", "111", "Hilter", "Aldof");

        membre1.authentifier("heman", "123");
        membre2.authentifier("shewoman", "qwerty");
        membre3.authentifier("transman", "cis");
        
        Categorie cat1 = new Categorie("Animaux de compagnie");
        Categorie sousCat1=new Categorie("chat");
        Categorie sousCat2=new Categorie("chien");
        sousCat1.setCategorieMere(cat1);
        sousCat2.setCategorieMere(cat1);
       
        Auteur auteur1 = new Auteur(5, "Woman", "Cat");

        Livre livre1 = new Livre(555, "How I met your kitten", "Cats", "Catnip society", sousCat1);
        Livre livre2 = new Livre(556, "Horrible dogs", "Dog's habits", "Catnip society", sousCat2);
        
        livre1.getAuteurs().add(auteur1);
        livre2.getAuteurs().add(auteur1);
        auteur1.getBibliographie().add(livre1);
        auteur1.getBibliographie().add(livre2);
        sousCat1.getLivres().add(livre1);
        sousCat2.getLivres().add(livre2);
        
        Cours vet = new Cours("Medecine veterinaire 101", "vet101", "Cours de base en medecine veterinaire");
        vet.getLivres().add(livre2);
        
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

        Annonce annonce1 = membre1.publierAnnonce(descriptions1, photos1);

        Signalement signalement1 = membre2.signalerAnnonce(annonce1, "J'aime les chiens, est insultante");

        ExperienceClient exp1 = membre3.commenterExperienceUtilisateur(5, 5, "Superbe", 5, annonce1);
        ExperienceClient exp2 = membre3.commenterExperienceUtilisateur(3, 4, "Bien", 4, annonce1);
        ExperienceClient exp3 = membre3.commenterExperienceUtilisateur(4, 5, "Passable", 5, annonce1);
        
        experiencesClient.add(exp1);
        experiencesClient.add(exp2);
        experiencesClient.add(exp3);
        
        System.out.println(admin1);
        System.out.println(admin2);
        System.out.println(admin3);
        System.out.println(admin4+"\n");
        System.out.println(membre1);
        System.out.println(membre2);
        System.out.println(membre3);
        System.out.println(membre4);
        System.out.println(membre5+"\n");

        System.out.println(desc1.getAnnonce().getNoAnnonce() + " " + desc1.getLivre().getTitre() + " " + desc1.getLivre().getAuteurs() + desc1.getLivre().getCategorie());
        System.out.println(desc2.getAnnonce().getNoAnnonce() + " " + desc2.getLivre().getTitre() + " " + desc2.getLivre().getAuteurs() + desc2.getLivre().getCategorie() + "\n");
    
        System.out.println(vet);
        
        System.out.println(annonce1);
        
        System.out.println(signalement1+"\n");
        
        for (ExperienceClient exp:experiencesClient) {
            System.out.println(exp);
        }
    }
}
