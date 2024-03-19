package com.company._240228_claseabstracta;

//SUBCLASE EXTENDIDA DE CLASE PRINCIPAL
public class Perro extends Animal{

    //CONSTRUCTOR
    public Perro(String nombre, Integer edad, String tipo, Integer cantPatas) {
        super(nombre, edad, tipo, cantPatas);
    }

    @Override
    public void hacerRuido() {
        System.out.println("El perro ladra");
    }
}
