package Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("1984", "George Orwell", "123456");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "654321");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.listarLibros();

        Usuario usuario = new Usuario("Carlos", 1);
        usuario.tomarLibro(libro1);
        usuario.devolverLibro(libro1);

        biblioteca.listarLibros();
    }
}

