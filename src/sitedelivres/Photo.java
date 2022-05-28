package sitedelivres;

import java.util.Date;

public class Photo {

    private int id;
    private Date dateAjout;
    private String chemin;

    private Annonce annonce;
    
    private int nombrePhotos = 1;

    public Photo() {
    }

    public Photo(Date dateAjout, String chemin, Annonce annonce) {
        this.id = nombrePhotos++;
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
        return "Photo{" + "id=" + id + ", dateAjout=" + dateAjout + ", chemin=" + chemin + ", annonce=" + annonce.getNoAnnonce() + '}';
    }

}
