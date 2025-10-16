package com.uniajc.parcial;

public class Arma {
    private String nombre;
    private int danioAdicional;

    public Arma(String nombre, int danioAdicional) {
        this.nombre = nombre;
        this.danioAdicional = danioAdicional;
    }

    public int getDanioAdicional() { return danioAdicional; }
    public String getNombre() { return nombre; }

    public void realizarAtaque(Guerrero guerrero, Criatura objetivo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarAtaque'");
    }

    
}


