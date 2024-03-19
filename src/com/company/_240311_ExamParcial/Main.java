package com.company._240311_ExamParcial;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("20220302", "Percy", "Perez",true);
        System.out.println("El paciente " + paciente1.getNombre() + " es su primera consulta: " + paciente1.evaluaInicial());

        Social social1 = new Social("20220302","Daniel","Bustamante",true,"AC",100);
        Social social2 = new Social("20220302","Pedro","Corrales",true,"AC",100);
        if(((Social)social1).compareTo(social2) == 1) System.out.println("El paciente de obra social " + social1.getNombre() + " es mayor");
        else if(((Social)social1).compareTo(social2) == -1) System.out.println("El paciente de obra social " + social2.getNombre() + " es menor");
        else System.out.println("El paciente " + social1.getNombre() + " y el paciente " + social2.getNombre() + " son iguales");
    }
}
