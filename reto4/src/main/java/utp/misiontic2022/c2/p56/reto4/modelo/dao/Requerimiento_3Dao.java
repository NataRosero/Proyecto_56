package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {

    private String constructora;
    private int costoLideres;

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        try{
            String sentencia = "SELECT p.Constructora AS 'Constructora' , SUM(l.Salario) AS 'Costo de líderes' FROM Lider l " +
            "JOIN Proyecto p ON l.ID_Lider = p.ID_Lider GROUP BY p.Constructora " +
            "HAVING (SUM(l.Salario) > 40000000) LIMIT 100"; 
            ResultSet consulta = conexion.ejecutarConsulta(sentencia);

                    while (consulta.next()) {
                        Requerimiento_3 requerimiento_3 = new Requerimiento_3();
                        constructora = consulta.getString ("Constructora");
                        costoLideres = consulta.getInt("Costo de líderes");
                        requerimiento_3.requerimiento_3(constructora, costoLideres);
                    
                        resultados.add (requerimiento_3);
                    }
                } catch (Exception e) {
                    System.err.println(e);
                }


        return resultados;
    }
}