package com.ensa.gi4.datatabase;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;

import java.util.List;

public interface crudDAO {
    //pour livre

    void ajouterLivre(Livre livre);
    void listerLivres();
    void modifierLivre(int id,String nom);
    void supprimerLivre(int id);
    Livre chercherLivre(int id);

    //pour chaise

    void ajouterChaise(Chaise chaise);
    void listerChaises();
    void modifierChaise(int id,String nom);
    void supprimerChaise(Integer id);
    Chaise chercherChaise(int id);




}
