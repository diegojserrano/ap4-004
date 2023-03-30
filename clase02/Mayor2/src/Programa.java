import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dos números");
        float numero1 = teclado.nextFloat();
        float numero2 = teclado.nextFloat();

        if (numero1 != numero2) {
            float mayor;

            if (numero1 > numero2) {
                mayor = numero1;
            } else {
                mayor = numero2;
            }

            System.out.println("El mayor es " + mayor);
        } else {
            System.out.println("Son iguales");
        }

    }
}
