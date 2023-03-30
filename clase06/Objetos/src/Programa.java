public class Programa {
    public static void main(String[] args) {

        // a es una variable de tipo referencia a Persona
        Persona a = new Persona(111,"Juan", "Perez"); // Crea una instancia de persona
        Persona b = new Persona(112, "Juana",  "Pino");

        System.out.println(a.getDocumento() + " " + a.getNombre().toUpperCase() + " " + a.getApellido().toUpperCase());
        System.out.println(b.getDocumento() + " " + b.getNombre() + " "  + b.getApellido());

        b.setNombre("");
        System.out.println(b.getDocumento() + " " + b.getNombre() + " " + b.getApellido());

    }
}
si
