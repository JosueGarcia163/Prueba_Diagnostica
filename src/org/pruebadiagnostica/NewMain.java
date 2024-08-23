package org.pruebadiagnostica;

import org.randyoscal.model.Desarrollador;
import org.randyoscal.model.Empleados;
import org.randyoscal.model.Test;

public class NewMain {

    public static void main(String[] args) {
        

        Desarrollador dev = new Desarrollador("Javier", 30, 12000.00, "Java");
        
        Test test = new Test("Manuel", 40, 10000.00, "Funcionalidad");
        
        
        dev.trabajar("Sistema de Gestion");
        
        test.trabajar("Selenium", "Aplicacion Web");
        
        Empleados empleado1 = new Desarrollador("Carlos", 25, 4000.00, "Python");
        
        Empleados empleado2 = new Test("Laura", 29, 3200.00, "Seguridad");
        
        
        empleado1.trabajar(8);
        empleado2.trabajar(6); 
    }
}
