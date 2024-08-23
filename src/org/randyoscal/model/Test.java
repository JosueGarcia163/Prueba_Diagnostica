package org.randyoscal.model;

public class Test extends Empleados {
    
    
    private String tipoPruebas;
    
    public Test(String nombre, int edad, double salario, String tipoPruebas){
        super(nombre, edad, salario);
        
        this.tipoPruebas = tipoPruebas;
    }

    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }
       

    @Override
    public void trabajar() {
        System.out.println(getNombre() + "esta haciendo pruebas de " + tipoPruebas);
        
    }
    
    public void trabajar(String herramientas, String proyecto){
        System.out.println(getNombre() + " esta probando el proyecto " + proyecto + "con la herramienta " + herramientas);
        
    }
    
}
