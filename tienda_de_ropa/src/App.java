import modelo.*;//el asterisco te importa todas as clases dentro de la carpeta
import Conexion.SqliteConnection;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("La Tienda");

        SqliteConnection connexionBD = new SqliteConnection();

        Producto productoUno = new Producto();
    
        productoUno.setNombre("Blusa");
        productoUno.setPrecio(65000.0);

        productoUno.mostrar();
    }

}
