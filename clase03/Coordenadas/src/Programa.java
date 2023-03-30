import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        float x, y;
        int cuadrante;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del punto");
        x = teclado.nextFloat();
        y = teclado.nextFloat();

        if (x != 0 && y != 0) { // Está en un cuadrante
            if (x > 0) { // Esta en el cuadrante I o IV
                if (y > 0) {
                    cuadrante = 1;
                } else {
                    cuadrante = 4;
                }
            } else { // Esta en el cuadrante II o III
                if (y > 0) {
                    cuadrante = 2;
                } else {
                    cuadrante = 3;
                }
            }

            System.out.println("Está en el cuadrante " + cuadrante);
        } else {  // Está en el origen o en un eje
            if (x == 0 && y == 0) {
                System.out.println("El punto es el origen");
            } else {
                if (x == 0) {
                    System.out.println("Está en el eje de las ordenadas");
                } else  {
                    System.out.println("Está en el eje de las abcisas");
                }
            }
        }

    }

}
