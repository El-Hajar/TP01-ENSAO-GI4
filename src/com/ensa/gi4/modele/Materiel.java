package com.ensa.gi4.modele;

public abstract class Materiel {
    protected int id;
    protected String name;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
