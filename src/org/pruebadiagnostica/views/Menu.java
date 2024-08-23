package org.pruebadiagnostica.views;

import java.util.Scanner;
import org.josuegarcia.controllers.Operaciones;
import org.randyoscal.model.Desarrollador;
import org.randyoscal.model.Empleados;
import org.randyoscal.model.Test;
import org.ricardofigueroa.system.app;

public class Menu extends Operaciones {

    public static void menu() {
        /*
    Ejercicio 
    Realizar un programa en consola que despliegue un menu y que sea capaz de realizar 
    los programas que se describan a continuacion:*/
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            // se crea el do para realizar el ciclo repetitivo con los numeros que sean diferentes a 6
            System.out.println("---------- Menu ----------");
            System.out.println("1. Ejercicio 1 ");
            System.out.println("2. Ejercio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.println("Escoger una opcion ");
            opcion = sc.nextInt();

            switch (opcion) {
                // se llaman los metodos de cada Funcion
                case 1:
                    Desarrollador dev = new Desarrollador("Javier", 30, 12000.00, "Java");
                    Test test = new Test("Manuel", 40, 10000.00, "Funcionalidad");

                    dev.trabajar("Sistema de Gestion");
                    test.trabajar("Selenium", "Aplicacion Web");
                    Empleados empleado1 = new Desarrollador("Carlos", 25, 4000.00, "Python");
                    Empleados empleado2 = new Test("Laura", 29, 3200.00, "Seguridad");

                    empleado1.trabajar(8);
                    empleado2.trabajar(6);
                    break;
                case 2:
                    poligono();

                    break;
                case 3:
                    app aplicacion = new app();
                    aplicacion.run();
                    break;

                default:
                    System.out.println("Que te le vaya bien!");
                    break;

            }
        } while (opcion != 4);
    }
}
