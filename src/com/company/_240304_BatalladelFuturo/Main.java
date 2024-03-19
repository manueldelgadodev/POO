package com.company._240304_BatalladelFuturo;

public class Main {
    public static void main(String[] args) {
        RobotLiviano robot1 = new RobotLiviano(100);
        SistemaArmas tanque1 = new Tanque(50);
        Senuelo senuelo1 = new Senuelo(10);

        robot1.atacar();
        robot1.defender();
        robot1.mostrar();
        robot1.volar();
        System.out.println("***************************");
        //CASTEO
        ((Tanque)tanque1).atacar();
        System.out.println("***************************");
        senuelo1.mostrar();
    }
}
