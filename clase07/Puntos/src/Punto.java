public class Punto {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String mensaje;
        int cuad = cuadrante();
        if (cuad == 0) mensaje = "en el origen";
        else if (cuad == -1) mensaje = "en el eje de las ordenadas";
        else if (cuad == -2) mensaje = "en el eje de las abscisas";
        else mensaje = "en el cuadrante " + cuad;
        return "El punto (" + x + "," + y + ") está " + mensaje;
    }

    public int cuadrante() {
        if (x == 0 && y == 0) return 0;
        if (x == 0) return -1;
        if (y == 0) return -2;
        if (x > 0) {
            return (y > 0)? 1: 4;
        } else {
            return (y > 0)? 2: 3;
        }
    }
}
