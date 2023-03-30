// Cargar numeros hasta que se ingrese un 0.
// Calcular e informar:
//      * Cantidad de números ingresados (sin contar el 0)
//      * Suma de todos

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x, cantidad = 0, suma = 0;
        int dd;
        System.out.println("Ingrese números (fin con 0)");
        x = teclado.nextInt(); // Cargo el primer numero

        while(x != 0) { // Mientras sea distinto de 0 siga dando vueltas
            System.out.println("Ud. ingresó " + x);

            cantidad++; // Cuenta las vueltas
            suma += x; // Acumula todos los valores de x
            // Como cargo un número por cada vuelta
            // La cantidad de números es igual a la cantidad de vueltas
            // Antes de cargar el siguiente tengo que procesar el valor de x
            x = teclado.nextInt();
        }

        System.out.println("Resultados");
        System.out.println("Cantidad de números cargados: " + cantidad);
        System.out.println("Suma de todos: " + suma);
    }
}
