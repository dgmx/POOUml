package GestionEmpleados;


public class Empresa {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Carlos", 1, 2000, 500);
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Ana", 2, 15, 160);

        System.out.println("Empleado: "  + emp1.getNombre() + " - Pago: €" + emp1.calcularPago());
        emp1.tipoEmpleado();
        System.out.println("Empleado: " + emp2.getNombre() + " - Pago: €" + emp2.calcularPago());
        emp2.tipoEmpleado();
    }
}
