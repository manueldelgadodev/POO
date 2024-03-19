package com.company._240306_PreExamen;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anoFabrica;
    protected Double eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anoFabrica, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabrica = anoFabrica;
        this.eslora = eslora;
    }

    public Double calcularMontoAlquiler() {
        if (anoFabrica > 2020) {
            return precioBase + valorAdicional;
        } else return precioBase;
    }
}
