package staticFunctions;

public class Main {
    public static void main(String[] args) {
        int q;
        q = cuadrado(5);
        System.out.println(q);
        System.out.println("------------");

        metodo1();
    }

    // funcion estatica que calcula el cuadrado de un número:
    public static int cuadrado(int a) {
        int c;
        c = a*a;
        return c;


    }
    public static void metodo1() {
        String [] palabras = new String[4];
        palabras[1] = "palabra1";
        palabras[2] = "palabra2";
        palabras[3] = "palabra3";
        try {
            System.out.println(" antes del for ");
            for (int i=1; i<palabras.length; i++)
            {
                System.out.println(palabras[i%3]);
            }
            System.out.println(" despues del for ");
        }catch (NullPointerException npe) {
            System.out.println(" null pointer ");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println(" array index out ");
        } catch (Exception e) {
            System.out.println(" exception ");
        }
        finally {
            System.out.println(" todo bien? ");
        }
    }

}
