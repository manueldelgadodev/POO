package com.company._240304_BatalladelFuturo;

public class RobotPesado extends SistemaArmas implements Atacante, Defensor, Volador {
    public RobotPesado(Integer energia) {
        super(energia);
    }
    @Override
    public void atacar() {
        System.out.println("El robot Pesado ataca");
    }
    @Override
    public void defender() {
        System.out.println("El robot Pesado defiende");
    }
    @Override
    public void mostrar() {
        System.out.println("Mostrando Robot Pesado");
    }
    @Override
    public void volar() {
        System.out.println("El robot Pesado vuela");
    }
}