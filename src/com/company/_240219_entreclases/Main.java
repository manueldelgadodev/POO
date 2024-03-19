package com.company._240219_entreclases;

public class Main {

    public static void main(String[] args) {
        Chofer chofer;
        Auto auto = new Auto("abc126", "Ford", "Modelo");
        chofer = new Chofer("Juan", "Delgado", new Auto("abc126", "Ford", "Modelo"));

        //chofer1 = new Chofer("Ana", "Rodriguez", auto);

        System.out.println("Patente auto asignado; " + chofer.verPatente());
    }

/* HERENCIAS JAVA
    public boolean equals(Object o) {
        if (o==null)
            return false;
        if (!(o instanceof Empleado))
            return false;
        else {
        }
    }
    public boolean equals(Object o) {
        if (o==null)
            return false;
        if (this.getClass()!=o.getClass())
            return false;
        else {
        }
    }
*/

}
