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
    public void defender(int daño) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defender'");
    }

    @Override
    protected int getFuerza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFuerza'");
    }
}

