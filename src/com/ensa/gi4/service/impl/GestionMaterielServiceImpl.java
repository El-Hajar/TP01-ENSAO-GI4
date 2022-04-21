package com.ensa.gi4.service.impl;

import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionChaiseService;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.Scanner;
import com.ensa.gi4.service.api.GestionLivreService;
public class GestionMaterielServiceImpl implements GestionMaterielService {
    private GestionLivreServiceImpl gestionLivreService;
    private GestionChaiseServiceImpl gestionChaiseService;

    public GestionMaterielServiceImpl(GestionLivreServiceImpl  gestionLivreService,GestionChaiseServiceImpl gestionChaiseService){
    this.gestionLivreService=gestionLivreService;
    this.gestionChaiseService=gestionChaiseService;
    }


    // bd goes here
    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
        System.out.println("Liste de matériel :");
        gestionLivreService.listerLivre();
        gestionChaiseService.listerChaise();
    }

    @Override
    public void ajouterNouveauMateriel() {
        // à compléter
        System.out.println("Tapez 1 si vous voulez ajouter un livre");
        System.out.println("Tapez 2 si vous voulez ajouter une chaise");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("1".equals(next)) {
            gestionLivreService.ajouterNouveauLivre();
            System.out.println("L'ajout du livre " + next + " effectué avec succès !");
        }else if("2".equals(next)) {
            gestionChaiseService.ajouterNouveauChaise();
            System.out.println("L'ajout du chaise " + next + " effectué avec succès !");
        }else{
            System.out.println("choix invalide");
        }


    }

    @Override
    public void chercherMateriel() {
        System.out.println("Tapez 1 si vous voulez chercher un livre");
        System.out.println("Tapez 2 si vous voulez chercher une chaise");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("saisir l'id de livre a chercher");
        Scanner s = new Scanner(System.in);
        int id= s.nextInt();

        if ("1".equals(next)) {

            gestionLivreService.chercherLivre(id);

        }else if("2".equals(next)) {
            gestionChaiseService.chercherChaise(id);

        }else{
            System.out.println("choix invalide");
        }

    }

    @Override
    public void SupprimerMateriel() {
        System.out.println("Tapez 1 si vous voulez supprimer un livre");
        System.out.println("Tapez 2 si vous voulez supprimer une chaise");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("saisir l'id du materiel a supprimer");
        Scanner scanner1 = new Scanner(System.in);
        int i = scanner1.nextInt();
        if ("1".equals(next)) {

            gestionLivreService.supprimerLivre(i);

        }else if("2".equals(next)) {
            gestionChaiseService.supprimerChaise(i);

        }else{
            System.out.println("choix invalide");
        }
    }

    @Override
    public void modifierMateriel() {
        System.out.println("entrer id du materiel à modifier");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        System.out.println("entrer le nouveau nom du materiel");
        Scanner nom = new Scanner(System.in);
        String n = nom.next();
        System.out.println("Tapez 1 si le materiel modifié est un livre");
        System.out.println("Tapez 2 si le materiel modifier est une chaise");
        Scanner scanner= new Scanner(System.in);
        String next = scanner.next();
        switch (next){
            case "1":
                gestionLivreService.modifierLivre(id,n);
            case "2":
                gestionChaiseService.modifierChaise(id,n);
        }

        System.out.println("le nouveau nom du materiel qui a id "+id +" c'est " + n);
    }
}
