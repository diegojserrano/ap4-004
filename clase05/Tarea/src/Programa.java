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
        int []numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = lector.nextInt();
        }



    }
}
