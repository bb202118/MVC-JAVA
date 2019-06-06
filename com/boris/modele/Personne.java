/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boris.modele;

/**
 *
 * @author boris
 */
public class Personne {
    
    private String nom;
    private String prenom;
    
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomPrenom() {
        return nom + " " + prenom;
    }

    public void setNomPrenom(String nomPrenom) {
        String[] s = nomPrenom.split(" ");
        this.nom = s[0];
        this.prenom = s[1];
    }
}
