package org.ricardofigueroa.views;

import org.ricardofigueroa.controllers.DispositivoController;

public class dispositivoView {
    private DispositivoController dispositivoController;

    // Constructor vacío
    public dispositivoView() {}

    // Constructor lleno
    public dispositivoView(DispositivoController dispositivoController) {
        this.dispositivoController = dispositivoController;
    }

    public void mostrarInformacion() {
        dispositivoController.mostrarInformacionDispositivo();
    }

    public void encender() {
        dispositivoController.encenderDispositivo();
    }

    public void encender(int parametro) {
        dispositivoController.encenderDispositivo(parametro);
    }

    public void encender(String parametro) {
        dispositivoController.encenderDispositivo(parametro);
    }
}
