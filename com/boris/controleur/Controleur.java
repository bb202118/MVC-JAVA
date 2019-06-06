/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boris.controleur;

import com.boris.modele.Personne;

/**
 *
 * @author boris
 */
public class Controleur extends Sujet {

    private Personne modele;
    
    public Controleur(Personne p){
        modele = p;
    }
    
    public void setNom(String nom){
        modele.setNom(nom);
        notifie();
    }
    
    public void setPrenom(String prenom){
        modele.setPrenom(prenom);
        notifie();
    }
    
    public void setNomPrenom(String nomPrenom){
        modele.setNomPrenom(nomPrenom);
        notifie();
    }
    
}
