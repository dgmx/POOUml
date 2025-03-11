package interfaces;

import java.util.ArrayList;

public class PartidoDelBuenCodigo {

    private final ArrayList<EnviadorDeMensaje> mensajeros;

    public PartidoDelBuenCodigo() {
        mensajeros = new ArrayList<>();
    }
    public void agregarMensajero(EnviadorDeMensaje mensajero) {
        this.mensajeros.add(mensajero);
    }

    public void hacercampana() {
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Vote por el PDBC");
        }
    }
}
