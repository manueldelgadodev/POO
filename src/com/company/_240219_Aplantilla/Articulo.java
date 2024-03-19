package com.company._240219_Aplantilla;

import com.company._240219_entreclases.Auto;

public class Articulo {
    private String descripcion; //VARIABLE
    private double precioVenta; //VARIABLE
    private int stock; //VARIABLE
    private Auto auto; //RELACIONES ENTRE CLASES

    //CONSTRUCTOR
    public Articulo(String descripcion, double precio, int stock) {
        this.descripcion = descripcion;
        precioVenta = precio;
        this.stock = stock;
    }

    //METODOS GET(Acceder al atributo) Y SET(Almacenar información)
    //cuando va VOID = VACIO no devuelve información
    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    //METODOS
    public boolean hayStock() {
        return stock>0;
    }
    public double consultarPrecio() {
        return precioVenta;
    }
}
