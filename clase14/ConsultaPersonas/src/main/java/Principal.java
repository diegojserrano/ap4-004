import java.sql.*;

public class Principal {

    public static void main(String[] args) throws SQLException {


        // Establecer la conexión
        // El primer parámetro es la cadena de conexión
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas009", "root", "root");

        // Si no se clavó: se pudo conectar bien
        // Crear un objeto Statement para enviar sentencias SQL
        Statement st = conn.createStatement();

        // Para ejecutar un SELECT se usa executeQuery
        ResultSet rs =  st.executeQuery("select * from personas");

        // Para leer las filas, un ciclo while
        while (rs.next()) {
            // Una vuelta por cada fila
            int doc = rs.getInt("documento");
            String nom = rs.getString("nombre");
            String ape = rs.getString("apellido");
            int edad = rs.getInt("edad");

            System.out.println(doc + " - " + nom + " - " + ape + " - " + edad);
        }

        rs.close();
        conn.close();

    }

}
