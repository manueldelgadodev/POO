package com.company._240311_ExamParcial;

public class Particular extends Paciente {
    private Double cobroConsulta;
    private String DNI;

    public Particular(String fechaMacimiento, String nombre, String apellido, Boolean primeraConsulta, Double cobroConsulta, String DNI) {
        super(fechaMacimiento, nombre, apellido, primeraConsulta);
        this.cobroConsulta = cobroConsulta;
        this.DNI = DNI;
    }
}
