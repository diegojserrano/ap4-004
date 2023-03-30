import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("personas2.txt");
        Scanner lector = new Scanner(archivo);
        Scanner teclado = new Scanner(System.in);

        lector.useDelimiter("[;\\n]");

        Padron listaSocios = new Padron();

        while (lector.hasNextInt()) {
            int doc = lector.nextInt();
            String nom = lector.next();
            String ape = lector.next();
            int edad = lector.nextInt();

            Persona nueva = new Persona(doc, nom, ape, edad);
            listaSocios.agregarPersona(nueva);
            //System.out.println(nueva);
        }

        lector.close();

        // Ya está: todas las personas están adentro del padrón.
        float promedio = listaSocios.promedioEdades();
        System.out.println("Promedio de edades: " + promedio);



        System.out.println("Ingrese el documento de la persona que busca: ");
        int documentoBuscado = teclado.nextInt();

        Persona encontrada = listaSocios.buscarPersona(documentoBuscado);
        if (encontrada == null) {
            System.out.println("No se encuentra");
        } else {
            System.out.println(encontrada);
        }

        System.out.println("Ingrese el nombre de la persona que busca: ");
        String nombreBuscado = teclado.next();

        ArrayList<Persona> encontradas = listaSocios.buscarPorNombre(nombreBuscado);

        System.out.println("Listado de personas que se llaman " + nombreBuscado);
        if (encontradas.isEmpty()) {
            System.out.println("No se encontraron");
        } else {
            for (Persona p : encontradas) {
                System.out.println(p);
            }
        }

    }
}