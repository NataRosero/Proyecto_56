package utp.misiontic2022.c2.p56.reto4.modelo.vo;

public class Requerimiento_1 {
    private String nombre_Material;
    private int precio_Unidad;
    private int iD_Proyecto;

    public void requerimiento_1 (String nombre_Material, int precio_Unidad, int iD_Proyecto){
        this.nombre_Material = nombre_Material;
        this.precio_Unidad = precio_Unidad;
        this.iD_Proyecto = iD_Proyecto;
        
    }

    public String getNombre_Material() {
        return nombre_Material;
    }

    public void setNombre_Material(String nombre_Material) {
        this.nombre_Material = nombre_Material;
    }

    public int getPrecio_Unidad() {
        return precio_Unidad;
    }

    public void setPrecio_Unidad(int precio_Unidad) {
        this.precio_Unidad = precio_Unidad;
    }

    public int getiD_Proyecto() {
        return iD_Proyecto;
    }

    public void setiD_Proyecto(int iD_Proyecto) {
        this.iD_Proyecto = iD_Proyecto;
    }

    

}
