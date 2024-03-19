package com.company._240228_claseabstracta;

//SUBCLASE EXTENDIDA DE CLASE PRINCIPAL
public class Gato extends Animal {

    //CONSTRUCTOR
    public Gato(String nombre, Integer edad, String tipo, Integer cantPatas) {
        super(nombre, edad, tipo, cantPatas);
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato hace miau");
    }

    public void comportamientoGatuno() {
        System.out.println("El gato siempre cae parado");
    }
}
