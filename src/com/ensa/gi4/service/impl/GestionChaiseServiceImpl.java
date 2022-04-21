package com.ensa.gi4.service.impl;

import com.ensa.gi4.datatabase.crudDAO;
import com.ensa.gi4.datatabase.usineMateriel;
import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.service.api.GestionChaiseService;

import java.util.Scanner;


public class GestionChaiseServiceImpl implements GestionChaiseService {
    private crudDAO dao;
    private usineMateriel usine;
    public GestionChaiseServiceImpl(crudDAO dao,usineMateriel usine){
        this.dao=dao;
        this.usine=usine;

    }

    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerChaise() {
        System.out.println("liste des chaises:");
        dao.listerChaises();
    }

    @Override
    public void ajouterNouveauChaise() {
        System.out.println("donner le nom du chaise a ajouté");
        Scanner scanner=new Scanner(System.in);
        String nom=scanner.next();
        dao.ajouterChaise(usine.createChaise(nom));
    }

    @Override
    public Chaise chercherChaise(int id) {
        Chaise chaise=dao.chercherChaise(id);
        System.out.println(chaise.getName() +"a comme id "+chaise.getId());
        return chaise;

    }

    @Override
    public void supprimerChaise(int id) {
        dao.supprimerChaise(id);
    }

    @Override
    public void modifierChaise(int id,String nom) {
        dao.modifierChaise(id,nom);
    }


}
