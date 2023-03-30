import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws IOException {

        // Pedir por teclado el nombre de un archivo de texto
        // Pedir por teclado una texto para buscar

        // Recorrer el archivo y mostrar todas aquellas lineas
        // Que contengan el texto buscado

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el texto a buscar: ");
        String buscado = sc.nextLine();


        Path archivo = Paths.get(nombre);
        if (Files.exists(archivo)) {

            int numeroLinea = 0;
            int cantidadLineasEncontradas = 0;
            int cantidadApariciones = 0;
            for(String linea: Files.readAllLines(archivo)) {
                numeroLinea++;
                if (linea.contains(buscado)) {
                    cantidadLineasEncontradas++;
                    String lineaColoreada = linea.replace(buscado, "\u001B[32m" + buscado  + "\u001B[37m");
                    System.out.println("Linea: " + numeroLinea + ": " + lineaColoreada);
                    int p = linea.indexOf(buscado);
                    int c = 0;
                    while (p != -1) {
                        c++;
                        p = linea.indexOf(buscado,p+1);
                    }
                    cantidadApariciones += c;
                }
            }

            if (cantidadLineasEncontradas > 0) {
                System.out.println("Encontrado en " + cantidadLineasEncontradas + " líneas");
                System.out.println("Apareció " + cantidadApariciones + " veces");
            } else {
                System.out.println("No se encontró el texto buscado");
            }

        } else {
            System.out.println("El archivo no existe");
        }

    }
}
