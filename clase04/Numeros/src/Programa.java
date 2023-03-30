import java.util.Scanner;

public class Programa {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          int []numeros;

          System.out.print("Ingrese la cantidad de números: ");
          int cantidad = sc.nextInt();

          numeros = new int[cantidad];


          System.out.println("Ingrese " + cantidad + " números");
          for(int i = 0; i < numeros.length; i++) {
               numeros[i] = sc.nextInt();
          }

          System.out.println("Listado de los números ingresados");
          for(int i = 0; i < numeros.length; i++) {
               System.out.println(numeros[i]);
          }

          System.out.println("Con for mejorado");
          for(int x:numeros) { // Por cada x perteneciente al arreglo de numeros
               System.out.println(x);
          }


          int suma = 0;
          // Abreviatura: fori
          for (int i = 0; i < numeros.length; i++) {
               suma += numeros[i];
          }

          suma = 0;
          for(int x: numeros) {
               suma += x;
          }

          float promedio = (float)suma / numeros.length;


          System.out.println("La suma de todos es: " + suma);
          System.out.println("Y el promedio: " + promedio);


     }
}
