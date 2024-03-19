package com.company._240306_PreExamen;

public class Veleros extends Embarcacion {
    private Integer cantMastiles;

    public Veleros(Capitan capitan, Double precioBase, Double valorAdicional, Integer anoFabrica, Double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anoFabrica, eslora);
        this.cantMastiles = cantidadMastiles;
    }
    public boolean veleroEsGrande(){
        if(cantMastiles > 4 && eslora > 10) {
            return true;
        } else return false;
    }
}
