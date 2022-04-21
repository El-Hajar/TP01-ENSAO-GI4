package com.ensa.gi4.service.impl;

import com.ensa.gi4.datatabase.crudDAO;
import com.ensa.gi4.datatabase.usineMateriel;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.service.api.GestionLivreService;
import java.util.Scanner;

public class GestionLivreServiceImpl implements GestionLivreService {
    private crudDAO dao;
    private usineMateriel usine;
    public GestionLivreServiceImpl(crudDAO dao,usineMateriel usine){
        this.dao=dao;
        this.usine=usine;
    }

    @Override
    public void init() {

    }

    @Override
    public void listerLivre() {
        System.out.println("liste des livres:");
        dao.listerLivres();
    }

    @Override
    public void ajouterNouveauLivre() {
        System.out.println("donner le nom du livre a ajouté");
        Scanner scanner=new Scanner(System.in);
        String nom=scanner.next();
        dao.ajouterLivre(usine.createLivre(nom));
    }

    @Override
    public Livre chercherLivre(int id) {

        Livre livre=dao.chercherLivre(id);

        System.out.println(livre.getName() +"a comme id "+livre.getId());
        return livre;
    }

    @Override
    public void supprimerLivre(int id) {
        System.out.println("supprimer le livre de la base de données");
        dao.supprimerLivre(id);
    }

    @Override
    public void modifierLivre(int id,String nom) {
        dao.modifierLivre(id,nom);
    }
}
