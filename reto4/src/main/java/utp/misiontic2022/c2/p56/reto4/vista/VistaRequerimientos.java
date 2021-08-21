package utp.misiontic2022.c2.p56.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        System.out.println("Nombre material-Precio unidad-Id del proyecto");
        try {
            ArrayList<Requerimiento_1> resultados = controlador.consultarRequerimiento1();
            for (Requerimiento_1 r: resultados){
                System.out.println(r.getNombre_Material() + "-$" +  r.getPrecio_Unidad() + "-" + r.getiD_Proyecto());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        System.out.println("Proveedor-Ventas");
        try {
            ArrayList<Requerimiento_2> resultados = controlador.consultarRequerimiento2();
            for (Requerimiento_2 r: resultados){
                System.out.println(r.getProveedor() + "-" +  r.getVentas());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        System.out.println("Constructora-Costo de líderes");
        try {
            ArrayList<Requerimiento_3> resultados = controlador.consultarRequerimiento3();
            for (Requerimiento_3 r: resultados){
                System.out.println(r.getConstructora() + "-" +  r.getCostoLideres());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
