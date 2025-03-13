package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libreria {
    private List<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la librería
    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
        } else {
            System.out.println("El libro ya está en la librería.");
        }
    }

    // Método para eliminar un libro por ISBN
    public void eliminarLibro(String isbn) {
        libros.removeIf(libro -> libro.getIsbn().equals(isbn));
    }

    // Método para buscar un libro por ISBN
    public Libro buscarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Método para ordenar los libros por precio
    public void ordenarPorPrecio() {
        Collections.sort(libros);
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
