package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Chaise;


public interface GestionChaiseService {
    void init();
    void listerChaise();
    void ajouterNouveauChaise();
    Chaise chercherChaise(int id);
    void supprimerChaise(int id);
    void modifierChaise(int id,String nom);
}

