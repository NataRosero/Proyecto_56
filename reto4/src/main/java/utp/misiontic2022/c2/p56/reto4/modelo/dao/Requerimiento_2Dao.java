package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    private String proveedor;
    private int ventas;


    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        try{
            String sentencia =  "SELECT Proveedor, COUNT(Cantidad) AS 'Ventas' FROM Compra  GROUP BY Proveedor ORDER BY Ventas DESC LIMIT 100"; 
            ResultSet consulta = conexion.ejecutarConsulta(sentencia);

                    while (consulta.next()) {
                        Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                        proveedor = consulta.getString ("Proveedor");
                        ventas = consulta.getInt("Ventas");
                        requerimiento_2.requerimiento_2(proveedor, ventas);
                    
                        resultados.add (requerimiento_2);
                    }
                } catch (Exception e) {
                    System.err.println(e);
                }

        return resultados;
    }
}