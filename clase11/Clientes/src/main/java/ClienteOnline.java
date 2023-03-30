public class ClienteOnline extends Cliente {

    private String email;

    public ClienteOnline(int codigo, String nombre, String telefono, String email) {
        super(codigo, nombre, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + " " + email;
    }
}
