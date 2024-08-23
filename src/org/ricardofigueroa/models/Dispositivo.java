package org.ricardofigueroa.models;

public abstract class Dispositivo {
    protected String marca;
    protected String modelo;
    protected int anio;

    // Constructor vacío
    public Dispositivo() {}

    // Constructor lleno
    public Dispositivo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract void encender();

    public void encender(int voltaje) {
        System.out.println("Encendiendo con voltaje: " + voltaje + "V");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
