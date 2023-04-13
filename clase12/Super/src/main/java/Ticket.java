import java.util.ArrayList;

public class Ticket {

    private ArrayList<Item> carrito;
    // Tambien puede ser un HashMap<Long,Item>
    // En el que la clave sea el codigo de barras

    public Ticket() {
        carrito = new ArrayList<>();
    }

    public void agregarItem(Item nuevo) {
        carrito.add(nuevo);
    }

    public int cantidadItems() {
        return carrito.size();
    }

    public double total() {
        int suma = 0;

        for(Item it: carrito) { // Por cada item del carrito
            suma += it.subTotal();
        }

        return suma;
    }

    public String toString() {
        String renglon = "-".repeat(62) + "\n";
        String listado = renglon + String.format("| %47s | %8d |\n", "Items", cantidadItems()) + renglon;

        for(Item it: carrito) {
            listado += it.toString() + "\n";
        }

        listado += renglon + String.format("| %47s | %8.2f |\n", "Total", total()) + renglon;
        return listado;
    }

}
