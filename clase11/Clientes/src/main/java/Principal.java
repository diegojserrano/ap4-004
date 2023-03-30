import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ClientePresencial cl1 = new ClientePresencial(1, "Pepe", "65465465",205);
        ClienteOnline cl2 = new ClienteOnline(2, "Maria", "---", "maria@gmail.com");

        System.out.println(cl1);
        System.out.println(cl2);

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cl1);
        listaClientes.add(cl2);

        System.out.println("Chau!!!");
    }
}
