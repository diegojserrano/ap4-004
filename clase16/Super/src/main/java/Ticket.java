import lombok.Getter;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Getter
public class Ticket {

    private ArrayList<Item> carrito;

    public Ticket() {
        carrito = new ArrayList<>();
    }

    public void agregarItem(Item nuevo) {
        carrito.add(nuevo);
    }

    @Override
    public String toString() {
        String listado = "Ticket: \n";

        for(Item it: carrito)
            listado += it.toString() + "\n";

        listado += "Cantidad de items: " + carrito.size() + "\n";
        listado += "Total: " + getTotal();
        return listado;
    }

    public double getTotal() {
        double suma = 0;

        for(Item it: carrito) // Por cada item del carrito
            suma += it.getSubtotal();
        return suma;

        //return carrito.stream().mapToDouble(Item::subtotal).sum();
    }

    // Nombres de los articulos en los que gaste mas de $1000
    // ordenados alfabeticamente y separados por coma
    public String getMayoresA1000() {
        return carrito.stream()
                .filter(it -> it.getSubtotal() > 1000)
                .map(Item::getNombre)
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
