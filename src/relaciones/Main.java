package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto();

        auto1.setId(20021);
        auto1.setMarca("Volvo");
        auto1.setModelo("C-30");

        List<Propietario> propietarios = new ArrayList<>();
        Propietario p1 = new Propietario(1, "Diego", "Gonzalez");
        Propietario p2 = new Propietario(2, "MJ", "Carrasco");

        propietarios.add(p1);
        propietarios.add(p2);

        auto1.setPropietarios(propietarios);

        System.out.printf("El coche " +  auto1.getMarca() + " " + auto1.getModelo() + " con matricula " + auto1.getId() + " tiene de propietarios " + auto1.getPropietarios().toString() + "\n");






    }
}
