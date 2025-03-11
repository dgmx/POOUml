package interfaces;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();

        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new Persona());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());

        p.hacercampana();
    }

}