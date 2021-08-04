package modelo;
public class Cliente {
    private String identificacion;
    private String nombres;
    private String apellidos;

//Constructor sobrecargado
    public Cliente (String indent, String nombre, String apellido){
        this.identificacion = ident;
        this.nombre = nombres;
        this.apellido = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }

}