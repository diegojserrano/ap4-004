import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // meses es un arraylist de strings
        ArrayList<String> meses = new ArrayList<>();

        System.out.println("Tamaño de la lista: " + meses.size());

        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");

        System.out.println("Tamaño de la lista: " + meses.size());

        System.out.println("Listado de todos con for común");
        for (int i = 0; i < meses.size(); i++) {
            System.out.println(meses.get(i));
        }

        System.out.println("Listado de todos con for mejorado");
        for(String x : meses) {
            System.out.println(x);
        }

        System.out.println("Está cargado el mes de Febrero? " + meses.contains("Febrero"));
        System.out.println("Está cargado el mes de Abril? " + meses.contains("Abril"));


        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(45);
        numeros.add(15);
        numeros.add(75);
        numeros.add(8);

        int suma = 0;
        for (Integer n: numeros) {
            suma += n;
        }

        System.out.println("La suma de los números ingresados es: " + suma);

    }
}