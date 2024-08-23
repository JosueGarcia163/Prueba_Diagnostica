package org.ricardofigueroa.controllers;

import org.ricardofigueroa.models.Dispositivo;

public class DispositivoController {
    private Dispositivo dispositivo;

    // Constructor que acepta un parámetro de tipo Dispositivo
    public DispositivoController(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void encenderDispositivo() {
        dispositivo.encender();
    }

    public void encenderDispositivo(int parametro) {
        dispositivo.encender(parametro);
    }

    public void encenderDispositivo(String parametro) {
        if (dispositivo instanceof org.ricardofigueroa.models.Telefono) {
            ((org.ricardofigueroa.models.Telefono) dispositivo).encender(parametro);
        } else if (dispositivo instanceof org.ricardofigueroa.models.Computadora) {
            ((org.ricardofigueroa.models.Computadora) dispositivo).encender(parametro);
        } else {
            System.out.println("Este dispositivo no soporta encender con un parámetro String.");
        }
    }

    public void mostrarInformacionDispositivo() {
        dispositivo.mostrarInformacion();
    }
}
