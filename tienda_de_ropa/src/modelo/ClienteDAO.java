package modelo;

import Conexion.SqliteConnection;

public class ClienteDAO {

    public void insertarCliente(Cliente nuevoCliente, SqliteConnection connectionBD){

        String sentencia = "INSERT INTO Clientes (identificacion, nombres, apellidos) VALUES ('" + nuevoCliente.getIdentificacion()+ "' , '" + nuevoCliente.getNombres() + "','" + nuevoCliente.getApellidos()"'";
        connexionBD.ejecutarSentencia(sentencia);
    }
}
