package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;

public interface GestionLivreService {
    void init();
    void listerLivre();
    void ajouterNouveauLivre();
    Livre chercherLivre(int id);
    void supprimerLivre(int id);
    void modifierLivre(int id,String nom);

}
