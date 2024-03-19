package com.company._240219_entreclases;

public class Auto {
    private String patente;
    private String marca;
//    private Motor motor; //-motor:Motor // CLASE DECLARADA // RELACIONES ENTRE CLASES
    private String modelo; //-modelo:String // VARIABLE DECLARADA
    protected Double saldo; //#saldo:Double // VARIABLE PROTEGIDA

    public Auto(String patente, String marca, String modelo) {
        this.patente = patente; //VARIABLE INSTANCIADA
        this.marca = marca;
        this.modelo = modelo;
//        motor = new Motor(); //CLASE INSTANCIADA
    }

    public String getPatente() {
        return patente;
    }
}
