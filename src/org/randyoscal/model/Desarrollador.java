package org.randyoscal.model;

public class Desarrollador extends Empleados{
    
    private String lenguajeProgramacion;
    
    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion){
        
        super(nombre, edad, salario);
        
        this.lenguajeProgramacion = lenguajeProgramacion;
        
    }
   

    public String getLenguajeProgramacion(){
    return lenguajeProgramacion;
    }
    
    public void setLenguajeProgramacion(String lenguajeProgramacion){
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    
    @Override
    public void trabajar() {
        System.out.println(getNombre() + " esta trabajando en " + lenguajeProgramacion);
    }
    
    public void trabajar(String proyecto){
        System.out.println(getNombre() + "esta trabajando en el proyecto " + proyecto + " con el lenguaje de " + lenguajeProgramacion);
    }

    
    
}
