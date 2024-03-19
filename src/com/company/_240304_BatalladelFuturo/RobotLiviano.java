package com.company._240304_BatalladelFuturo;

public class RobotLiviano extends SistemaArmas implements Atacante, Defensor, Volador {
    public RobotLiviano(Integer energia) {
        super(energia);
    }
    @Override
    public void atacar() {
        System.out.println("El robot liviano ataca");
    }
    @Override
    public void defender() {
        System.out.println("El robot liviano defiende");
    }
    @Override
    public void mostrar() {
        System.out.println("Mostrando Robot Liviano");
    }
    @Override
    public void volar() {
        System.out.println("El robot liviano vuela");
    }
}