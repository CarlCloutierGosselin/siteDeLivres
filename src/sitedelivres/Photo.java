package sitedelivres;

import java.util.Date;

public class Photo {

    private static int id = 1;
    private Date dateAjout;
    private String chemin;
    private Annonce annonce;

    public Photo() {
        Photo.id = id++;
    }

    public Photo(Date dateAjout, String chemin, Annonce annonce) {
        Photo.id = id++;
        this.dateAjout = dateAjout;
        this.chemin = chemin;
        this.annonce = annonce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    @Override
    public String toString() {
        return "Photo{" + "id=" + id + ", dateAjout=" + dateAjout 
                + ", chemin=" + chemin + ", annonce=" + annonce.getNoAnnonce() + '}';
    }

}
