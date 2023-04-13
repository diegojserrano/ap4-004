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
        return  String.format("| %10d | %-15s | %5.2f | %8.2f | \u001B[31m%8.2f\u001B[0m |",
                codigo, nombre, cantidad, precioUnitario, subTotal());
    }

    public double subTotal() {
        return cantidad * precioUnitario;
    }

}
