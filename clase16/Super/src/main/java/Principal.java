import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.*;

public class Principal {

    public static void main(String[] args) throws SQLException, IOException {

        // Establecer una conexión con la base de datos
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/Super009", "root", "root");
        // Si llega hasta acá, la conexión fue satisfactoria
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from Items"); // para ejecutar los SELECT
        //st.executeUpdate(); // para ejecutar todas las otras instrucciones

        Ticket t = new Ticket();

        while(rs.next()) { // Una vuelta por cada fila del select
            long cod = rs.getLong("codigo");
            String nom = rs.getString("nombre");
            double cant = rs.getDouble("cantidad");
            double pu = rs.getDouble("precio");

            Item nuevo = new Item(cod, nom, cant, pu);
            t.agregarItem(nuevo);
        }

        System.out.println(t);
        System.out.println("Productos de mas de $1000: " + t.getMayoresA1000());

        rs.close();
        connection.close();

        // Generar un json que represente al ticket t
        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writerWithDefaultPrettyPrinter().writeValueAsString(t)); // Convertir t a un String
        om.writeValue(Paths.get("ticket.json").toFile() , t);



    }

//    public static void main(String[] args) throws IOException {
//
//        Path archivo = Paths.get("ticket.csv");
//        Scanner lector = new Scanner(archivo);
//
//        lector.useDelimiter("[;\\n\\r]+");
//        Ticket t = new Ticket();
//
//        while(lector.hasNextLong()) { // Una vuelta por cada linea del archivo
//            long cod = lector.nextLong();
//            String nom = lector.next();
//            double cant = lector.nextDouble();
//            double pu = lector.nextDouble();
//
//            Item nuevo = new Item(cod, nom, cant, pu);
//            t.agregarItem(nuevo);
//        }
//
//        System.out.println(t);
//        System.out.println("Productos de mas de $1000: " + t.listadoCaros());
//        lector.close();
//
//    }
}
