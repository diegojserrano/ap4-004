public class Programa {

    public static void main(String[] args) {

        Persona a = new Persona(111, "Sergio", "Gomez", 1990);
        Persona b = new Persona(122, "Ana", "Pino", 1993);

        a.setEmail("notiene@hotmail.com");

        // El main debe mostrar el siguiente texto para cada persona
        // La persona <documento> se llama <nombre> <apellido> y tiene <edad> años

        System.out.println(a);
        System.out.println(b);

    }

}
