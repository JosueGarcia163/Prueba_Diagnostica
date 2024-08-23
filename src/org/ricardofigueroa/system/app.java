package org.ricardofigueroa.system;

import org.ricardofigueroa.models.*;
import org.ricardofigueroa.controllers.*;
import org.ricardofigueroa.views.*;

public class app {
    
    public void run() {
        System.out.println("========================================");

        Dispositivo telefono = new Telefono("Samsung", "Galaxy S21", 2021, "Smartphone");
        DispositivoController telefonoController = new DispositivoController(telefono);
        dispositivoView telefonoView = new dispositivoView(telefonoController);

        telefonoView.mostrarInformacion();
        telefonoView.encender();
        telefonoView.encender("1234");

        System.out.println("========================================");

        Dispositivo computadora = new Computadora("Dell", "XPS 13", 2022, "Windows 10");
        DispositivoController computadoraController = new DispositivoController(computadora);
        dispositivoView computadoraView = new dispositivoView(computadoraController);

        computadoraView.mostrarInformacion();
        computadoraView.encender();
        computadoraView.encender("clave-segura");

        System.out.println("========================================");

        Dispositivo televisor = new Televisor("LG", "OLED55CXPUA", 2020, 55);
        DispositivoController televisorController = new DispositivoController(televisor);
        dispositivoView televisorView = new dispositivoView(televisorController);

        televisorView.mostrarInformacion();
        televisorView.encender();
        televisorView.encender(30);

        System.out.println("========================================");
        System.out.println("                                        ");
        System.out.println("                                        ");
        System.out.println("                                        ");

        // Mensaje final indicando que el ejercicio fue terminado
        System.out.println("========================================");
        System.out.println("El ejercicio 3 ha sido terminado.");
        System.out.println("========================================");

        // Sprite de un personaje animado (un simple robot)
        System.out.println("      _____  ");
        System.out.println("    /      \\ ");
        System.out.println("   |  O  O  |");
        System.out.println("   |   ||   |");
        System.out.println("   | \\_==_/ |");
        System.out.println("    \\______/");
        System.out.println("   /|      |\\");
        System.out.println("  / |      | \\");
        System.out.println(" /  |______|  \\");
        System.out.println("    | |  | |");
        System.out.println("    | |  | |");
        System.out.println("    []    []");
    }
}
