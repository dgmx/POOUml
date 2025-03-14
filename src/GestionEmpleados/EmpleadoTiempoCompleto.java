package GestionEmpleados;

class EmpleadoTiempoCompleto extends Empleado {
    private double bono;

    public EmpleadoTiempoCompleto(String nombre, int id, double salarioBase, double bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }

    // @Override
    public double calcularPago() {
        return salarioBase + bono;
    }
    public void tipoEmpleado() {
        System.out.println(getNombre() + " es empleado a Tiempo Completo");
    }
}
