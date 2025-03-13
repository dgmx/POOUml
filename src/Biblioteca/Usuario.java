package Biblioteca;

class Usuario {
    private String nombre;
    private int id;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void tomarLibro(Libro libro) {
        if (libro.estaDisponible()) {
            libro.prestar();
            System.out.println(nombre + " ha tomado el libro: " + libro.getTitulo());
        } else {
            System.out.println(nombre + " no pudo tomar el libro: " + libro.getTitulo());
        }
    }

    public void devolverLibro(Libro libro) {
        libro.devolver();
        System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
    }
}
