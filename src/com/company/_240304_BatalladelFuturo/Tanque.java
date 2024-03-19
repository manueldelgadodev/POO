package com.company._240304_BatalladelFuturo;

public class Tanque extends SistemaArmas implements Atacante, Defensor {
    public Tanque(Integer energia) {
        super(energia);
    }
    @Override
    public void atacar() {
        System.out.println("El tanque ataca");
    }
    @Override
    public void defender() {
        System.out.println("El tanque defiende");
    }
    @Override
    public void mostrar() {
        System.out.println("Mostrando Tanque");
    }
}