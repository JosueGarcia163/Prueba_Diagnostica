package org.pruebadiagnostica.views;

import java.util.Scanner;
import org.josuegarcia.controllers.Operaciones;
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
