package org.ricardofigueroa.models;

public class Computadora extends Dispositivo {
    private String sistemaOperativo;

    // Constructor vacío
    public Computadora() {}

    // Constructor lleno
    public Computadora(String marca, String modelo, int anio, String sistemaOperativo) {
        super(marca, modelo, anio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void encender() {
        System.out.println("La computadora se está encendiendo...");
    }

    public void encender(String clave) {
        System.out.println("Encendiendo la computadora con clave de usuario: " + clave);
    }
}
