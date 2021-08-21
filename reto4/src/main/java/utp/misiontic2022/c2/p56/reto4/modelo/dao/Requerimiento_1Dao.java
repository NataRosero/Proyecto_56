package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    private String nombre_Material;
    private int precio_Unidad;
    private int iD_Proyecto;

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        try{
        String sentencia =  "SELECT mc.Nombre_Material As 'Nombre material'  , mc.Precio_Unidad As 'Precio unidad' , p.ID_Proyecto As 'ID del Proyecto' " +
                            "FROM Proyecto p JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto " +
                            "JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion " +
                            "WHERE Ciudad = 'Ibague' AND mc.Importado = 'Si' LIMIT 100 "; 
        ResultSet consulta = conexion.ejecutarConsulta(sentencia);


                while (consulta.next()) {
                    Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                    nombre_Material = consulta.getString ("Nombre material");
                    precio_Unidad = consulta.getInt("Precio unidad");
                    iD_Proyecto = consulta.getInt("ID del Proyecto");
                    requerimiento_1.requerimiento_1(nombre_Material, precio_Unidad, iD_Proyecto);
                
                    resultados.add (requerimiento_1);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
            return resultados;

    }


}

