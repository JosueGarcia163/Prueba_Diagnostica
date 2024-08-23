package org.ricardofigueroa.models;

public class Telefono extends Dispositivo {
    private String tipo;

    // Constructor vacío
    public Telefono() {}

    // Constructor lleno
    public Telefono(String marca, String modelo, int anio, String tipo) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }

    @Override
    public void encender() {
        System.out.println("El teléfono se está encendiendo...");
    }

    public void encender(String codigo) {
        System.out.println("Encendiendo el teléfono con código de desbloqueo: " + codigo);
    }
}
