/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boris.vue;

import com.boris.controleur.Sujet;

/**
 *
 * @author boris
 */
public interface Observateur {
    
    void miseAJour(Sujet exped);
    
}
