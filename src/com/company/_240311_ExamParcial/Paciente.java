package com.company._240311_ExamParcial;

public class Paciente {
    private String fechaMacimiento;
    private String nombre;
    private String apellido;
    private Boolean primeraConsulta;

    public Paciente(String fechaMacimiento, String nombre, String apellido, Boolean primeraConsulta) {
        this.fechaMacimiento = fechaMacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = primeraConsulta;
    }

    public String getFechaMacimiento() {
        return fechaMacimiento;
    }

    public void setFechaMacimiento(String fechaMacimiento) {
        this.fechaMacimiento = fechaMacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getPrimeraConsulta() {
        return primeraConsulta;
    }

    public void setPrimeraConsulta(Boolean primeraConsulta) {
        this.primeraConsulta = primeraConsulta;
    }

    public boolean evaluaInicial() {
        if(primeraConsulta == true) {
            return true;
        } else return false;
    }
}
