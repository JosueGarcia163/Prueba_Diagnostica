package org.josuegarcia.models;

public abstract class Forma {

    private int color;
    private int longitud;
    private int altura;

    public Forma() {
    }

    public Forma(int color, int longitud, int altura) {
        this.color = color;
        this.longitud = longitud;
        this.altura = altura;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void areaForma(){
        System.out.println("Valor");
    }

}
