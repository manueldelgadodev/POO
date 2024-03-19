package com.company._240311_ExamParcial;

import java.sql.Time;
import java.util.Date;

public abstract class Consultas {
    private Paciente paciente;
    private Medicos medico;
    private Date fechaConsulta;
    private String especialidad;
    private Time horaMinuto;

    public Consultas(Paciente paciente, Medicos medico, Date fechaConsulta, String especialidad, Time horaMinuto) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaMinuto = horaMinuto;
    }
}
