public class Persona {
    // Atributos
    private int documento;
    private String nombre;
    private String apellido;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        if (documento > 0) {
            this.documento = documento;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 2) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.length() > 2) {
            this.apellido = apellido;
        }
    }

    public Persona(int documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;

    }
}
