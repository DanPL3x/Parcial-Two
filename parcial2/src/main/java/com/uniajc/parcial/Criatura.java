package com.uniajc.parcial;

    public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura enemigo);
    public abstract void defender(int dano);

    public boolean estaViva() {
        return salud > 0;
    }

    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }

    protected abstract int getFuerza();

    protected abstract void reducirSalud(int danioTotal);
}
