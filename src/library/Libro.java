package library;

import java.util.Objects;

public class Libro implements Cloneable, Comparable<Libro> {
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String isbn, String titulo, String autor, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPrecio() { return precio; }

    // Setters
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Método para clonar el libro
    @Override
    public Libro clone() {
        try {
            return (Libro) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;  // Devolver null si no se puede clonar
        }
    }

    // Método para comparar libros por precio
    @Override
    public int compareTo(Libro otro) {
        return Double.compare(this.precio, otro.precio);
    }

    // Equals y hashCode basados en el ISBN
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    // Método toString para mostrar información del libro
    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + isbn + '\'' +
                ", Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Precio=" + precio +
                '}';
    }
}
