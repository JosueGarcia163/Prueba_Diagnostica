package org.josuegarcia.models;

public abstract class Forma {

    private int color;
    private int longitud;
    private int altura;
    private int radio;

    public Forma() {
    }

    public Forma(int color, int longitud, int altura, int radio) {
        this.color = color;
        this.longitud = longitud;
        this.altura = altura;
        this.radio = radio;
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

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    public void areaForma(){
        System.out.println("Valor");
    }
    

}
