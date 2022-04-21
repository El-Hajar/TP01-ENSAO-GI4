package com.ensa.gi4.datatabase;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;

public class usineMateriel {

    public static int id=1;

    public usineMateriel(){

    }
public Livre createLivre(String nom){
    return new Livre(id++,nom);
}
public Chaise createChaise(String nom){
    return new Chaise(id++,nom);
}
}
