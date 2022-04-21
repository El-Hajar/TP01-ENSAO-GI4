package com.ensa.gi4.datatabase;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class crudDAOImpl implements crudDAO{

    List<Livre> livres=new ArrayList<>();
    List<Chaise> chaises=new ArrayList<>();

    @Override
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        System.out.println("livre "+livre.getName()+" est ajoutée avec succes");
    }

    @Override
    public void listerLivres() {
        for (Livre livre:livres
             ) {
            System.out.println(livre.getId()+"-"+ livre.getName());
        }
    }

    @Override
    public void modifierLivre(int id,String nom) {
        Livre livre1 = livres.stream().filter(livre -> livre.getId() == id).findFirst().orElse(null);

        livre1.setName(nom);
        System.out.println("livre a ete modifier avec succee \n");

    }

    @Override
    public void supprimerLivre(int id) {
        livres.removeIf(l -> l.getId() == id);
    }

    @Override
    public Livre chercherLivre(int id) {

        Livre livre = livres.stream().filter(l-> l.getId() == id).findFirst().orElse(null);
        return livre;
    }


    //chaises

    @Override
    public void ajouterChaise(Chaise chaise) {
        chaises.add(chaise);
        System.out.println("livre "+chaise.getName()+" est ajoutée avec succes");
    }


    @Override
    public void listerChaises() {
        for (Chaise chaise:chaises
        ) {
            System.out.println(chaise.getId()+"-"+chaise.getName());
        }
    }

    @Override
    public void modifierChaise(int id,String nom) {
        Chaise chaise1 = chaises.stream().filter(chaise -> chaise.getId() == id).findFirst().orElse(null);

        chaise1.setName(nom);
        System.out.println("chaise a ete modifier avec succee \n");


    }

    @Override
    public void supprimerChaise(Integer id) {
        chaises.removeIf(c -> c.getId() == id);

    }

    @Override
    public Chaise chercherChaise( int id) {
        Chaise chaise = chaises.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
        System.out.println(chaise);
        return chaise;
    }
}
