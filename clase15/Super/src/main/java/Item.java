import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Item {

    private long codigo;
    private String nombre;
    private double cantidad;
    private double precioUnitario;

    @Override
    public String toString() {
        return codigo + " " + nombre + " " + cantidad + " " + precioUnitario;
    }

    public double subtotal() {
        return cantidad * precioUnitario;
    }

}
