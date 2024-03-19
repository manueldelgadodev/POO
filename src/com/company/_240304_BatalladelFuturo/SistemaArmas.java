package com.company._240304_BatalladelFuturo;

public abstract class SistemaArmas {

    //ATRIBUTOS
    private Integer energia;

    //CONSTRUCTOR
    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

    //METODO
    public abstract void mostrar ();
}