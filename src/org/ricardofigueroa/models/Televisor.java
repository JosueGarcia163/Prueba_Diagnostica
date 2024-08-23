package org.ricardofigueroa.models;

public class Televisor extends Dispositivo {
    private int tamanoPantalla;

    // Constructor vacío
    public Televisor() {}

    // Constructor lleno
    public Televisor(String marca, String modelo, int anio, int tamanoPantalla) {
        super(marca, modelo, anio);
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public void encender() {
        System.out.println("El televisor se está encendiendo...");
    }

    public void encender(int volumen) {
        System.out.println("Encendiendo el televisor con volumen: " + volumen);
    }
}
