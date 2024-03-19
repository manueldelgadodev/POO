package com.company._240219_Aplantilla;

public class Main {

    public static void main(String[] args) {
        Articulo articulo; //INSTANCIA PARA USAR
        articulo = new Articulo("articulo1", 1000, 100);
        System.out.println("Precio " + articulo.consultarPrecio());
    }
}