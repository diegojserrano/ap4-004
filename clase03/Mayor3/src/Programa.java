import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3, mayor;

        System.out.println("Ingrese tres números: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        // Alternativa 1: voy comparando de a dos cualquiera y descartando
        if (n1 > n2) { // El n2 no es el mayor, lo descarto
            if (n1 > n3) {
                mayor = n1;
            } else {
                mayor = n3;
            }
        } else { // El n1 no es el mayor
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }

        // Alternativa 2: Usando &&
        // && devuelve verdadero si ambos operandos son verdaderos
        // Empiezo suponiendo que el n1 es el mayor
        if (n1 > n2 && n1 > n3) { // El n1 es el mayor
            mayor = n1;
        } else { // El n1 NO ES el mayor, lo descarto
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }


        // Alternativa 3: calcular mayores parciales
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }
        // En este punto conozco el mayor entre los dos primeros
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El mayor es: " + mayor);
    }
}
