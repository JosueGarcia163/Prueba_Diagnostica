package org.josuegarcia.models;

public class Cuadrado extends Forma {

    public Cuadrado() {
    }

    public Cuadrado(int color, int longitud, int altura, int radio) {
        super(color, longitud, altura, radio);
    }

    @Override
    public void areaForma() {
        int resultado2 = (getLongitud() * getLongitud());
        System.out.println("El Area es de: " + resultado2);
    }

}
