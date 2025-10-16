package com.uniajc.parcial;

public class Dragon extends Criatura implements Volador {
    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        // ejemplo: ataque de mordida + fuego (fuerza * 2)
        int danio = this.fuerza * 2;
        System.out.println(nombre + " lanza ataque de fuego causando " + danio);
        objetivo.defender(danio);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " despega y surca los cielos.");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterriza majestuosamente.");
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
        salud -= danioTotal;
        System.out.println(nombre + " recibe " + danioTotal + " de daño. Salud restante: " + salud);
        if (salud <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

}

