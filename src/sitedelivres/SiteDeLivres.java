package sitedelivres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SiteDeLivres {

    static Set<ExperienceClient> experiencesClient = new HashSet(0);
    static Set<Description> descriptions = new HashSet(0);

    public static void main(String[] args) {
        //Tests de notre acteur membre
        Membre membre1 = new Membre(new Date(), "courrier@gman.org", "8195551234", "123 fake street Dudeswell", StatutMembre.ACTIF, "heman", "123", "Haffett", "Bob");
        Membre membre2 = new Membre(new Date(), "fatiguant@gman.org", "8195556666", "1 real street Montsureal", StatutMembre.ACTIF, "shewoman", "qwerty", "Hann", "Anne");
        Membre membre3 = new Membre(new Date(), "tannant@gman.org", "5145556789", "3 weird street Quebec", StatutMembre.ACTIF, "transman", "cis", "Duran", "Duran");
        Membre membre4 = new Membre(new Date(), "intense@universitedelavie.gg", "4505559999", "666 hell street", StatutMembre.ACTIF, "transwoman", "arcenciel", "Dion", "Celine");
        Membre membre5 = new Membre(new Date(), "pasdfond@hostmall.org", "5145552222", "123 habitant street", StatutMembre.ACTIF, "thebestofthebestofthebest", "111", "Hilter", "Aldof");

        //On s'assure que nos membres se log in
        membre1.authentifier("heman", "123");
        membre2.authentifier("shewoman", "qwerty");
        membre3.authentifier("transman", "cis");

        //On cree des categories et leurs sous categories
        Categorie categAnimaux = new Categorie("Animaux de compagnie");
        Categorie categChat = new Categorie("chat");
        Categorie categChien = new Categorie("chien");
        categChat.setCategorieMere(categAnimaux);
        categChien.setCategorieMere(categAnimaux);

        Categorie categVehicule = new Categorie("Vehicules");
        Categorie categMoto = new Categorie("Moto");
        Categorie categBus = new Categorie("Autobus");
        categMoto.setCategorieMere(categVehicule);
        categBus.setCategorieMere(categVehicule);

        Categorie categProg = new Categorie("Programmation");

        //On cree des auteurs
        Auteur auteur1 = new Auteur(5, "Woman", "Cat");
        Auteur auteur2 = new Auteur(4, "De Pise", "Bernard");
        Auteur auteur3 = new Auteur(1, "Tremblay", "Priscille");

        //On cree des livres, et les associons avec leurs auteurs, et leur categorie s'il y a lieu
        Livre livre1 = new Livre(555, "How I met your kitten", "Cats", "Catnip society", null);
        livre1.ajouterAuteur(auteur1);
        livre1.setCategorie(categChat);

        Livre livre2 = new Livre(556, "Horrible dogs", "Dog's habits", "Catnip society", null);
        livre2.ajouterAuteur(auteur1);
        livre2.setCategorie(categChien);

        Livre livre3 = new Livre(557, "Les transports en communs : L'autobus", "Statistiques concernant les autobus", "Editions serieuses", null);
        livre3.ajouterAuteur(auteur2);
        livre3.ajouterAuteur(auteur3);
        livre3.setCategorie(categBus);

        Livre livre4 = new Livre(558, "Le guide de l'auto", "Comparaisons entre vehicules", "Editions serieuses", null);
        livre4.ajouterAuteur(auteur3);
        livre4.setCategorie(categVehicule);

        Livre livre5 = new Livre(559, "La bible du C++", "Apprendre a coder", "Editions serieuses", null);
        livre5.ajouterAuteur(auteur3);
        livre5.setCategorie(categProg);
        
        Livre livre6 = new Livre(560, "La bible du VB", "Apprendre a coder", "Editions serieuses", null);
        livre6.ajouterAuteur(auteur3);
        livre6.setCategorie(categProg);
        
        
        
        //On ajoute des cours, et associons les livres qu'ils reiquierent

        Cours vet = new Cours("Medecine veterinaire 101", "vet101", "Cours de base en medecine veterinaire");
        livre2.ajouterCours(vet);
        livre1.ajouterCours(vet);

        Cours mecanique = new Cours("Mecanique 101", "mec101", "Cours de base en entretien automobile");
        livre3.ajouterCours(mecanique);
        livre4.ajouterCours(mecanique);

        Cours prog = new Cours("programmation 103", "prg103", "Cours de programmation intermediaire");
        livre5.ajouterCours(prog);
        livre6.ajouterCours(prog);

        //Creation d'annonces test
        Photo photo1 = new Photo(new Date(), "https://petitchatton.org/chatton109", null);
        Photo photo2 = new Photo(new Date(), "https://petitchien.gg/snoopdog", null);

        Description desc1 = new Description("Lamentable", 9.99f, "Étrange histoire de chat", null, livre1);
        Description desc2 = new Description("Neuf", 5.99f, "Une personne detestant vraiment les chiens...", null, livre2);

        Set<Photo> photos1 = new HashSet(0);
        photos1.add(photo1);
        photos1.add(photo2);

        Set<Description> descriptions1 = new HashSet(0);
        descriptions1.add(desc1);
        descriptions1.add(desc2);
        descriptions.addAll(descriptions1);

        Annonce annonce1 = membre1.publierAnnonce(descriptions1, photos1);

        System.out.println(annonce1);

        //Creation d'une deuxieme annonce
        Photo photo3 = new Photo(new Date(), "https://monbazou.org/char.png", null);
        Photo photo4 = new Photo(new Date(), "https://autobusdeville.gg/autobus.png", null);

        Description desc3 = new Description("Ok", 19.99f, "Tres bon livre comparatif de char", null, livre4);
        Description desc4 = new Description("Ok", 255.99f, "Trop cher pour ce que s'est, mais necessaire pour le cours", null, livre3);

        Set<Photo> photos2 = new HashSet(0);
        photos2.add(photo3);
        photos2.add(photo4);

        Set<Description> descriptions2 = new HashSet(0);
        descriptions2.add(desc3);
        descriptions2.add(desc4);
        descriptions.addAll(descriptions2);

        Annonce annonce2 = membre1.publierAnnonce(descriptions2, photos2);

        System.out.println(annonce2);

        //Creation d'une troisieme annonce
        Photo photo5 = new Photo(new Date(), "https://imgstocklivre.org/biblbecplusplus.png", null);

        Description desc5 = new Description("Bien", 59.99f, "Bien, mais bof, on trouve tout en ligne", null, livre5);

        Set<Photo> photos3 = new HashSet(0);
        photos3.add(photo5);

        Set<Description> descriptions3 = new HashSet(0);
        descriptions3.add(desc5);
        descriptions.addAll(descriptions3);

        Annonce annonce3 = membre2.publierAnnonce(descriptions3, photos3);
        System.out.println(annonce3);
        
        //Creation d'une quatrieme annonce
        Photo photo6 = new Photo(new Date(), "https://imgstocklivre.org/biblbevb.png", null);

        Description desc6 = new Description("Superbe", 19.99f, "Bien, mais bof, on trouve tout en ligne", null, livre6);

        Set<Photo> photos4 = new HashSet(0);
        photos3.add(photo6);

        Set<Description> descriptions4 = new HashSet(0);
        descriptions4.add(desc6);
        descriptions.addAll(descriptions4);

        Annonce annonce4 = membre2.publierAnnonce(descriptions4, photos4);
        System.out.println(annonce4);

        //on affiche la totalite des descriptions qui associent les annonces et les livres
        for (Description desc : descriptions) {
            System.out.println(desc);
        }

        //procedons a des recherches dans nos annonces
        //Recherche par cours
        Set<Description> resultat1 = membre2.rechercherAnnonces(descriptions, vet);
        System.out.println("Resultat des descriptions correspondant au cours: " + vet.getSigle() + "");
        for (Description desc : resultat1) {
            System.out.println("\t" + desc);
        }

        //Recherche par prix
        System.out.println("Resultat des descriptions entre 10$ et 5000$");
        Set<Description> resultat2 = membre2.rechercherAnnonces(descriptions, 10.00f, 5000.00f);
        for(Description desc : resultat2){
            System.out.println("\t" + desc);
        }
        
        //Recherche par Mot clé dans les titres
        System.out.println("Resultat des descriptions ayant un livre comportant bible dans son titre");
        Set<Description> resultat3 = membre3.rechercherAnnonces(descriptions, "bible");
        for(Description desc : resultat3){
            System.out.println("\t" + desc);
        }
        
        //Recherche par categories
        System.out.println("Resultat des descriptions ayant un livre de categorie: " + categChat.getNom());
        Set<Description> resultat4 = membre3.rechercherAnnonces(descriptions, categChat);
        for(Description desc : resultat4){
            System.out.println("\t" + desc);
        }
        
        //Test de recherche composite
        //On veut les descriptions correspondant aux livres entre 10$ et 5000$ contenant bible dans le titre
        Set<Description> resultatTemporaire = membre2.rechercherAnnonces(descriptions, 10.00f, 5000.00f);
        Set<Description> resultatComposite = membre2.rechercherAnnonces(resultatTemporaire, "bible");
        
        System.out.println("Resultat des descriptions ayant un livre dont le titre est bible, et entre 10$ et 5000$");
        for(Description desc : resultatComposite){
            System.out.println("\t" + desc);
        }

        Signalement signalement1 = membre2.signalerAnnonce(annonce1, "J'aime les chiens, est insultante");
        Signalement signalement2 = membre4.signalerAnnonce(annonce1, "C'est troublant");

        //System.out.println(auteur1);
        //System.out.println(categBus);
        //System.out.println(vet);
        //System.out.println(mecanique);
        //System.out.println(desc1);
        //System.out.println(livre4);
//        ExperienceClient exp1 = membre3.commenterExperienceUtilisateur(5, 5, "Superbe", 5, annonce1);
//        ExperienceClient exp2 = membre3.commenterExperienceUtilisateur(3, 4, "Bien", 4, annonce1);
//        ExperienceClient exp3 = membre3.commenterExperienceUtilisateur(4, 5, "Passable", 5, annonce1);
//
//        experiencesClient.add(exp1);
//        experiencesClient.add(exp2);
//        experiencesClient.add(exp3);
//
//        System.out.println(membre1);
//        System.out.println(membre2);
//        System.out.println(membre3);
//        System.out.println(membre4);
//        System.out.println(membre5 + "\n");
//
//        System.out.println(desc1.getAnnonce().getNoAnnonce() + " " + desc1.getLivre().getTitre() + " " + desc1.getLivre().getAuteurs() + desc1.getLivre().getCategorie());
//        System.out.println(desc2.getAnnonce().getNoAnnonce() + " " + desc2.getLivre().getTitre() + " " + desc2.getLivre().getAuteurs() + desc2.getLivre().getCategorie() + "\n");
//
//        System.out.println(vet);
//
//        System.out.println(annonce1);
//
//        System.out.println(signalement1 + "\n");
//
//        for (ExperienceClient exp : experiencesClient) {
//            System.out.println(exp);
//        }
//
//        //Test de notre acteur Administrateur
//        Administrateur admin1 = new Administrateur("admin001", "qwerty", "Poitra", "Robert");
//        Administrateur admin2 = new Administrateur("admin002", "12345", "Wayne", "Bruce");
//        Administrateur admin3 = new Administrateur("admin003", "love", "Password", "Login");
//        Administrateur admin4 = new Administrateur("admin004", "admin", "Admin", "Admin");
//
//        System.out.println(admin1);
//        System.out.println(admin2);
//        System.out.println(admin3);
//        System.out.println(admin4 + "\n");
    }
}
