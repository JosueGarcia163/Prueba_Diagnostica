
package org.randyoscal.model;

public abstract class Empleados {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleados() {
    }

    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
}
