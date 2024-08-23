
package org.josuegarcia.models;


public class Triangulo extends Forma{

    public Triangulo() {
    }

    public Triangulo(int color, int longitud, int altura, int radio) {
        super(color, longitud, altura, radio);
    }

    @Override
    public void areaForma() {
          int resultado2 = ((getLongitud() * getAltura())/2);
        System.out.println("El Area es de: " + resultado2);
    }
    
}
