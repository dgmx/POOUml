package staticFunctions;

public class Main {
    public static void main(String[] args) {
        int q;
        q = cuadrado(5);
        System.out.print(q);
    }

    // funcion estatica que calcula el cuadrado de un número:
    public static int cuadrado(int a) {
        int c;
        c = a*a;
        return c;

    }
}
