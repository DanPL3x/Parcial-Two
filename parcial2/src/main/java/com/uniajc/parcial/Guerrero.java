package com.uniajc.parcial;

public class Guerrero extends Criatura {
    private Arma arma; 

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void equiparArma(Arma arma) { this.arma = arma; }
    public void desequiparArma() { this.arma = null; }

    @Override
    public void atacar(Criatura objetivo) {
        if (arma != null) {
            arma.realizarAtaque(this, objetivo);
        } else {
            int danio = this.fuerza;
            System.out.println(nombre + " ataca desarmado causando " + danio);
            objetivo.defender(danio);
        }
    }

    @Override
    public void defender(int dano) {
        salud -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Salud restante: " + salud);
        if (salud <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }   
    @Override
    protected int getFuerza() {
        return fuerza;
    }

    @Override
    protected void reducirSalud(int danioTotal) {       

    }
} 