import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("numeros.txt");
        Scanner lector = new Scanner(archivo);

        int suma = 0;
        int cantidad = 0;
        while(lector.hasNextInt()) {
            int x = lector.nextInt();
            suma += x;
            cantidad++;
            System.out.println(x);
        }

        float promedio = (float) suma / cantidad;
        System.out.println(suma);
        System.out.println(cantidad);
        System.out.println(promedio);

    }
}
