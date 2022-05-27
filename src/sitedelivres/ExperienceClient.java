/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitedelivres;

import java.util.Date;

/**
 *
 * @author Carl
 */
public class ExperienceClient {

    private int noteLivre;
    private int noteVendeur;
    private String commentaire;
    private Date date;
    private boolean estAcheteurFinal;
    private Utilisateur utilisateur;
    private Annonce annonce;

    public ExperienceClient() {
    }

    public ExperienceClient(int noteLivre, int noteVendeur, String commentaire, Date date, boolean estAcheteurFinal, Utilisateur utilisateur, Annonce annonce) {
        this.noteLivre = noteLivre;
        this.noteVendeur = noteVendeur;
        this.commentaire = commentaire;
        this.date = date;
        this.estAcheteurFinal = estAcheteurFinal;
        this.utilisateur = utilisateur;
        this.annonce = annonce;
    }

    public int getNoteLivre() {
        return noteLivre;
    }

    public void setNoteLivre(int noteLivre) {
        this.noteLivre = noteLivre;
    }

    public int getNoteVendeur() {
        return noteVendeur;
    }

    public void setNoteVendeur(int noteVendeur) {
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

    public boolean isEstAcheteurFinal() {
        return estAcheteurFinal;
    }

    public void setEstAcheteurFinal(boolean estAcheteurFinal) {
        this.estAcheteurFinal = estAcheteurFinal;
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

}
