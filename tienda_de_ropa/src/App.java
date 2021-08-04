import modelo.*;//el asterisco te importa todas as clases dentro de la carpeta

import java.sql.ResultSet;

import Conexion.SqliteConnection;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("La Tienda");

        SqliteConnection connexionBD = new SqliteConnection();
        ResultSet resultado = connexionBD.ejecutarConsulta("SELECT * FROM Productos");
        while(resultado.next()){
            String codiBarras = resultado.getString("codigoBarras");
            String nombre = resultado.getString("nombre");
            float precio = resultado.getFloat("precio");

            System.out.println(codiBarras+ " " + nombre + " " + " $" + precio);
        
        }
        String sentencia = "INSERT INTO Clientes (identificacion, nombres, id)("191212", "Juan", "Perez")";
        connexionBD.ejecutarSentencia(sentencia);
        
        ResultSet resultadoClientes = connexionBD.ejecutarConsulta("SELECT * FROM Clientes");

//        Producto productoUno = new Producto();

//        productoUno.setNombre("Blusa");
//        productoUno.setPrecio(65000.0);

//        productoUno.mostrar();
    }

}
