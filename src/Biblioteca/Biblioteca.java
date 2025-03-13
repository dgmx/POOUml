package Biblioteca;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> catalogo;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void listarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : catalogo) {
            System.out.println("- " + libro.getTitulo() + " (Disponible: " + libro.estaDisponible() + ")");
        }
    }
}
