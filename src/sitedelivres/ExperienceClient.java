package sitedelivres;

import java.util.Date;

public class ExperienceClient {

    private int noteLivre;
    private int noteVendeur;
    private String commentaire;
    private Date date;
    private Utilisateur utilisateur;
    private Annonce annonce;

    public ExperienceClient() {
    }

    public ExperienceClient(int noteLivre, int noteVendeur, String commentaire, Date date, Utilisateur utilisateur, Annonce annonce) {
        this.noteLivre = noteLivre;
        this.noteVendeur = noteVendeur;
        this.commentaire = commentaire;
        this.date = date;
        this.utilisateur = utilisateur;
        this.annonce = annonce;
    }

    public int getNoteLivre() {
        return noteLivre;
    }

    public void setNoteLivre(int noteLivre) {
        if (noteLivre >= 0 && noteLivre < 6) {
            this.noteLivre = noteLivre;
        }

    }

    public int getNoteVendeur() {
        return noteVendeur;
    }

    public void setNoteVendeur(int noteVendeur) {
        if (noteVendeur >= 0 && noteVendeur < 6)
        this.noteVendeur = noteVendeur;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    @Override
    public String toString() {
        return "ExperienceClient{" + "noteLivre=" + noteLivre + ", noteVendeur=" + noteVendeur + ", commentaire=" + commentaire + ", date=" + date + ", utilisateur=" + utilisateur.getNom() + ", annonce=" + annonce.getNoAnnonce() + '}';
    }

}
