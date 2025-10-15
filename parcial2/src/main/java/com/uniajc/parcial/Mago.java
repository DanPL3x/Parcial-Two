package com.uniajc.parcial;

import com.uniajc.Magico;


public class Mago extends Criatura implements Magico {
    private String hechizoAprendido;

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        if (hechizoAprendido != null) {
            lanzarHechizo(objetivo);
        } else {
            int danio = this.fuerza;
            System.out.println(nombre + " ataca con su bastón causando " + danio);
            objetivo.defender(danio);
        }
    }

    @Override
    public void lanzarHechizo(Criatura objetivo) {
        // ejemplo simple de hechizo: daño igual a fuerza + 5
        int danio = this.fuerza + 5;
        System.out.println(nombre + " lanza " + hechizoAprendido + " causando " + danio);
        objetivo.defender(danio);
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        this.hechizoAprendido = hechizo;
        System.out.println(nombre + " aprende el hechizo: " + hechizo);
    }

    @Override
    public void defender(int daño) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defender'");
    }
}
