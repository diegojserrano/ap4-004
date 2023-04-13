import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("ticket.csv");
        Scanner lector = new Scanner(archivo);

        lector.useDelimiter("[;\\n]");

        Ticket t = new Ticket();

        while(lector.hasNextLong()) { // En cada vuelta lee una línea del archivo
            long cod = lector.nextLong();
            String nom = lector.next();
            double cant = lector.nextDouble();
            double pu = lector.nextDouble();

            Item nuevo = new Item(cod,nom,cant,pu);
            t.agregarItem(nuevo);
        }
        lector.close();

        //System.out.println("Cantidad de items en el carrito: " + t.cantidadItems());
        //System.out.println("Total a pagar:" + t.total());
        System.out.println(t);
    }
}
