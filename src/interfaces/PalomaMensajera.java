package interfaces;

import java.io.Serializable;

public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

    public void volarRapido() {
        System.out.print("Volando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println("Lanzando Papel: " + mensaje);


    }
}
