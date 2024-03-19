package com.company._240306_PreExamen;

public class Main {
    public static void main(String[] args) {
        Capitan jack = new Capitan("Jack", "Sparrow", 00001);
        Embarcacion perlaNegra = new Veleros(jack, 1000.00, 50.00, 2020, 15.00, 6);
        System.out.println(((Veleros)perlaNegra).veleroEsGrande());
        Embarcacion yate1 = new Yates(jack, 1500, 50, 2020, 15, 5);
        Embarcacion yate2 = new Yates(jack,1500, 50, 2021, 10, 3);
        System.out.println("comparando yates:");
        if(((Yates)yate1).compareTo(yate2) == 1) {
            System.out.println("yate1 es mayor");
        } else if(((Yates)yate1).compareTo(yate2) == -1) {
            System.out.println("yate1 es menor");
        } else System.out.println("son iguales");
    }
}
