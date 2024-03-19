package com.company._240228_claseabstracta;

public class Main {
    //CREACIÓN DEL OBJETO
    public static void main(String[] args) {
        Animal animal = new Perro("Hola", 15, "a", 4);
        animal = new Gato("J", 14, "s", 4);

        animal.hacerRuido();

        Gato gato = new Gato("hola", 4, "a", 4);
        gato.comportamientoGatuno();
    }
}
