public class ClientePresencial extends Cliente { // Un cliente presencial es un cliente

    private int sucursal;

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public ClientePresencial(int codigo, String nombre, String telefono, int sucursal) {
        super(codigo, nombre, telefono); // llama al constructor de la clase base
        this.sucursal = sucursal;
    }


    @Override
    public String toString() {
        return "Soy un cliente presencial: " + codigo + " - " + nombre + " " + telefono + " " + sucursal;
    }

}
