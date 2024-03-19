package com.company._240311_ExamParcial;

public class Social extends Paciente implements Comparable {
    private String obraSocial;
    private Integer numAsociado;

    public Social(String fechaMacimiento, String nombre, String apellido, Boolean primeraConsulta, String obraSocial, Integer numAsociado) {
        super(fechaMacimiento, nombre, apellido, primeraConsulta);
        this.obraSocial = obraSocial;
        this.numAsociado = numAsociado;
    }

    @Override
    public int compareTo(Object o) {
        Social paciente = (Social)o;
        if(this.numAsociado > paciente.numAsociado) {
            return 1;
        } else if(this.numAsociado < paciente.numAsociado) {
            return -1;
        } else return 0;
    }
}
