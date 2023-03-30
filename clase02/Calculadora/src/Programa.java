import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese dos números");
        // Pausa el programa hasta que el usuario pulse <Enter>
        float numero1 = teclado.nextFloat();
        float numero2 = teclado.nextFloat();

        float suma = numero1 + numero2;
        float diferencia = numero1 - numero2;
        float producto = numero1 * numero2;
        // "Molde" o "cast": conversión explícita de un valor (no de una variable)

        System.out.println("La suma es " + suma);
        System.out.println("La diferencia es " + diferencia);
        System.out.println("El producto es " + producto);

        if (numero2 != 0) {
            float cociente = numero1 / (float) numero2;
            System.out.printf("El cociente es %16.3f", cociente);
        } else {
            System.out.println("No puedo dividir por 0!");
        }
    }
}
