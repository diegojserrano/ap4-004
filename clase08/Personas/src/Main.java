import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Persona a = new Persona(234, "Mario", "Gomez",21);
        Persona b = new Persona(182, "Ana", "Soto", 20);
        Persona c = new Persona(92, "Pedro", "Martinez", 30);

        HashMap<Integer,Persona> padron = new HashMap<>();

        padron.put(a.getDocumento(), a);
        padron.put(b.getDocumento(), b);
        padron.put(c.getDocumento(), c);

        System.out.println("Persona 234: " + padron.get(234));
        System.out.println("Persona 77: " + padron.get(77));
        System.out.println("Persona 92: " + padron.get(92));

        System.out.println("Listado de todos");
        for(Persona p: padron.values()) {
            System.out.println(p);
        }


    }
}