public class Cliente extends Persona implements Tiquete{

    private int id; //datos privados

    public void setId(int id) {
        this.id = id; //no hay ningún tipo de retorno
    }

    public int getId() {
        return this.id;
    }

    @Override
    public float calcularPrecio(float precioBase) {
        float precioFinal = precioBase - 1000;
        return precioFinal;
    }

    @Override 
    public void mostrarDatos(){
        System.out.println("Cédula = " + this.cedula + " Nombre = " +  this.nombre + " ID = " + this.id);
    }
}

