package com.uniajc.parcial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAtacarConArma {

    @Test
public void testAtacarConArma() {
    Guerrero g = new Guerrero("Conan", 40, 7);
    Guerrero enemigo = new Guerrero("Orco", 30, 5);
    Arma espada = new Arma("Espada", 4);
    g.equiparArma(espada);

    g.atacar(enemigo);
    assertEquals(30, enemigo.getSalud()); // Espera que 30 - (7+4) = 19
}

    
}
