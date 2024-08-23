package org.josuegarcia.models;

public class Circulo extends Forma {

    public Circulo() {
    }

    public Circulo(int color, int longitud, int altura, int radio) {
        super(color, longitud, altura, radio);
    }

    

    @Override
    public void areaForma() {
        double pi = 3.1415;
        int resultado2 = (int) (pi * getRadio() * getRadio());
        System.out.println("El Area es de: " + resultado2);
    }
}
