package com.company._240306_PreExamen;

public class Yates extends Embarcacion implements Comparable{
    private int cantCamarotes;

    public Yates(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yates yate = (Yates)o;
        if(this.cantCamarotes > yate.cantCamarotes) {
            return 1;
        } else if(this.cantCamarotes < yate.cantCamarotes) {
            return -1;
        } else return 0;
    }
}
