package GestionEmpleados;

class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
    public void tipoEmpleado() {
        System.out.println(getNombre() + " es empleado a Tiempo por Horas");
    }
}
