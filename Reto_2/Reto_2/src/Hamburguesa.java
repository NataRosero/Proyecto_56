public class Hamburguesa {

    String adicional;
    int tamanoN = 0;
    double precioBase = 5000;
    double precioGeneral = 0;
    private String tamano;
    private boolean cebolla;
    private int adicionalN;

    public Hamburguesa(String adicional, int tamanoN, int adicionalN, double precioBase, String tamano, boolean cebolla) {
    this.adicional = adicional;
    this.tamanoN = tamanoN;
    this.adicionalN = adicionalN;
    this.precioBase = precioBase;
    this.tamano = tamano;
    this.cebolla = cebolla;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano; 
    }

    String getTamano() {
        return this.tamano;
    }

    public void tamanoF(String tamano){
    switch(tamano) {
        case "Normal":
            tamanoN = 1; 
            break;
        case "Doble":
            tamanoN = 2; 
            break;
        default:
            tamanoN = 1;
        }  
    }


        // tamano.equalsIgnoreCase(tamano);
        // if (tamano.equalsIgnoreCase("Normal"));{
        //     tamanoN = 1;
        //     break;
        // } else if (tamano.equalsIgnoreCase("Doble"));{
        //     tamanoN = 2; 
        //         break;}

    public void agregarAdicional(String adicional) {
        this.adicional = adicional;

        switch(adicional) {
            case "Tocineta":
                adicionalN = 3000; 
                break;
            case "Jalapeños":
                adicionalN = 2000; 
                break;
        }
    }
    public void setAdicional(String adicional) {
        this.adicional = adicional; 
    }

    public int getAdicional() {
        return this.adicionalN;
    }

    @Override
    public double calcularPrecio() {
    precioGeneral = (precioBase * tamanoN) + adicionalN;
    return precioGeneral;
    }
}