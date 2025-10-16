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

public void realizarAtaque(Criatura atacante, Criatura enemigo) {
    int danioTotal = atacante.getFuerza() + danioAdicional;
    enemigo.reducirSalud(danioTotal);
}

}


