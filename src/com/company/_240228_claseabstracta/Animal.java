package com.company._240228_claseabstracta;

public abstract class Animal {

    //ATRIBUTOS
    private String nombre;
    private Integer edad;
    private String tipo;
    private Integer cantPatas;

    //CONSTRUCTOR
    public Animal(String nombre, Integer edad, String tipo, Integer cantPatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.cantPatas = cantPatas;
    }

    //METODOS
    public abstract void hacerRuido(); //METODO SE REUTILIZA PARA OTRAS CLASES
    //public abstract void hacerRuido();
    public String jugar() {
        return nombre + "esta jugando";
    }
}
