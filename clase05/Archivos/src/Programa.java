import java.io.IOException;
import java.nio.file.*;

public class Programa {

    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("saludo.txt");

        long tamaño = Files.size(archivo);

        System.out.println(tamaño);

        Path carpeta = Paths.get(".");

        // No miren la linea que sigue
        for(Path p: Files.list(carpeta).toList()) {
            if (Files.isDirectory(p))
                System.out.print("Carpeta: ");
            else
                System.out.print("Archivo: ");
            System.out.println(p);
        }

        for(String linea : Files.readAllLines(archivo)) {
            System.out.println(linea);
        }
    }
}
