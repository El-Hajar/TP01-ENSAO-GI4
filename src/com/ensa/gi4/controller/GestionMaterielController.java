package com.ensa.gi4.controller;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.Scanner;

public class GestionMaterielController {

    private GestionMaterielService gestionMaterielService;

    public void listerMateriel() {
        gestionMaterielService.listerMateriel();
    }

    public void afficherMenu() {
        System.out.println("1- pour lister le matériel, entrer 1");
        System.out.println("2- pour ajouter un nouveau matériel, entrer 2");
        System.out.println("3- pour modifier un  matériel, entrer 3");
        System.out.println("4- pour chercher un matériel, entrer 4");
        System.out.println("5- pour supprimer un  matériel, entrer 5");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
            listerMateriel();
        } else if ("2".equals(next)) {
            // ajouter nouveau matériel
            Materiel materiel=new Materiel() {
            };
            //System.out.println("donner le nom du materiel a ajouter:");
            //Scanner s=new Scanner(System.in);
           // materiel.setName(s.next());
            //System.out.println(materiel.getName());
            gestionMaterielService.ajouterNouveauMateriel();
        }else if("3".equals(next)){
            gestionMaterielService.modifierMateriel();
        }else if("4".equals(next)){
            gestionMaterielService.chercherMateriel();
        }else if("5".equals(next)){
            gestionMaterielService.SupprimerMateriel();
        }
        else {
            System.out.println("choix invalide");
        }
    }

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielService gestionMaterielService) {
        // injection par accesseur
        this.gestionMaterielService = gestionMaterielService;
    }
}
