import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException {
        Path archivo = Paths.get("numeros.txt");
        Scanner lector = new Scanner(archivo);
        Scanner teclado = new Scanner(System.in);

        int cantidad = lector.nextInt();

        int[] numeros = new int[cantidad];

        // Carga del archivo en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lector.nextInt();
        }

        // Listado del arreglo
        //for (int i = 0; i < numeros.length; i++) {
        //    System.out.println(numeros[i]);
        //}

        // Punto 1
        System.out.print("Ingrese el mínimo para calcular el promedio: ");
        int minimo = teclado.nextInt();
        System.out.print("Ingrese el máximo para calcular el promedio: ");
        int maximo = teclado.nextInt();

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= minimo && numeros[i] <= maximo) { // Condición de filtro
                suma += numeros[i];
                contador++;
            }
        }

        float promedio = (float) suma / contador;

        System.out.println("El promedio de los numeros entre " + minimo + " y " + maximo + " es " + promedio);

        // Punto 2
        int menor = 0;
        boolean primero = true;


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 1) { // El resto despues de dividir en 2 es 1
                // Si es el primero o el menor
                if (primero == true || numeros[i] < menor) {
                    menor = numeros[i];
                    primero = false;
                }
            }
        }

        System.out.println("El menor de todos es: " + menor);

        // Punto 3
        System.out.println("Ingrese el número para el que quiere buscar los múltiplos:");
        int n = teclado.nextInt();

        for (int i = numeros.length-1; i >= 0; i--) { // Recorre el vector hacia atrás
            //System.out.print(numeros[i]);
            if (numeros[i] % n == 0) {
                System.out.println(numeros[i] + " ES MULTIPLO");
            }
        }
    }
}