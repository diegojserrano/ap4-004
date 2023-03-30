import java.util.ArrayList;
import java.util.HashMap;

public class Padron {

    // Acá está la composición!
    private HashMap<Integer, Persona> personas;


    public Padron() {
        personas = new HashMap<>();
    }

    public void agregarPersona(Persona nueva) {
        // Podría validar
        personas.put(nueva.getDocumento(), nueva);
    }

    public float promedioEdades() {
        int suma = 0;

        for(Persona p: personas.values()) {
            suma += p.getEdad();
        }

        return (float)suma / personas.size();
    }

    public Persona buscarPersona(int buscado) {
        return personas.get(buscado);
    }


    public ArrayList<Persona> buscarPorNombre(String buscado) {
        ArrayList<Persona> encontradas = new ArrayList<>();

        for(Persona p: personas.values()) {
            if (p.getNombre().equals(buscado)) {
                encontradas.add(p);
            }
        }

        return encontradas;
    }

}
