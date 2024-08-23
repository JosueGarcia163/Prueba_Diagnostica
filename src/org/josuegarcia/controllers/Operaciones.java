package org.josuegarcia.controllers;

import java.util.Scanner;
import org.josuegarcia.models.Circulo;
import org.josuegarcia.models.Cuadrado;
import org.josuegarcia.models.Triangulo;

public class Operaciones {

    public static void poligono() {
        /*
        Inicializamos el escanner Y luego colocamos el do con el menu para escoger las opciones
        de las operaciones que queramos realizar.
         */
        Scanner sc = new Scanner(System.in);
        int opcionP;
        do {
            System.out.println("--------------------- Menu ------------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Presiona si quieres sacar area de cuadrado ");
            System.out.println("2. Presiona para saber el area de un triangulo ");
            System.out.println("3. Presiona para saber el area de un circulo");
            System.out.println("4. Salir del menu de Operaciones de poligonos");
            System.out.println("Escoger una opcion ");
            opcionP = sc.nextInt();

            switch (opcionP) {
                // le decimos al usuario que ingrese el valor del lado para sacar el perimetro del cuadrado.
                case 1:
                    Cuadrado cuadrado1 = new Cuadrado();
                    int valor1;
                    System.out.println("Ingrese la longitud del lado del cuadrado");
                    valor1 = sc.nextInt();
                    cuadrado1.setLongitud(valor1);
                    cuadrado1.areaForma();
                    break;
                case 2:
                    // se le pregunta al usuario la longitud y altura del rectangulo
                    Triangulo triangulo = new Triangulo();
                    int valor3;
                    int valor4;

                    System.out.println("Ingrese el altura triangulo");
                    valor3 = sc.nextInt();

                    System.out.println("Ingrese la longitud base triangulo");
                    valor4 = sc.nextInt();

                    triangulo.setAltura(valor3);
                    triangulo.setLongitud(valor4);
                    triangulo.areaForma();
                    break;
                case 3:
                    // se le pregunta al usuario la longitud y altura del rectangulo
                    Circulo circulo = new Circulo();
                    int valor5;

                    System.out.println("Ingrese el radio del circulo");
                    valor5 = sc.nextInt();

                    circulo.setRadio(valor5);
                    circulo.areaForma();

                    break;

                default:
                    System.out.println("Que paso mano");
                    break;
            }
        } while (opcionP != 4);
    }
}
