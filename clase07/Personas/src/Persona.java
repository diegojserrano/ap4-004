public class Persona {

    private int documento;
    private String nombre;
    private String apellido;
    private int nacimiento;
    private String email;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String nombreCompleto() {
        // Ahora todas las personas saben calcular su nombre completo
        return nombre + " " + apellido;
    }

    public int edad() {
        return 2023 - nacimiento;
    }

    public Persona(int documento, String nombre, String apellido, int nacimiento) {

        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }

    public String toString() {
        // La idea del toString es que el objeto responda un String
        // en el que muestre todo su estado: el valor de sus atributos
        String correo;
        if (email != null)
            correo = "su correo electrónico es " + email;
        else
            correo = "no tiene correo";

        return "La persona con documento " + getDocumento() + " se llama " + nombreCompleto() +
                ", tiene " + edad() + " años y " + correo;
    }
}
