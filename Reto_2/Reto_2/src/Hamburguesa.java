public class Hamburguesa {

    static final double PRECIO_BASE = 5000;
    static final String TAMANO = "Normal";
    static final boolean CEBOLLA = false;
    protected String tamano;
    protected Boolean cebolla;
    protected double precioBase;
    protected String adicional;

    public Hamburguesa(){

    }

    public static double isPrecioBase() {
        return PRECIO_BASE;
    }

    public static boolean isCebolla() {
        return CEBOLLA;
    }

    public Boolean getCebolla() {
        return cebolla;
    }

    public void setCebolla(Boolean cebolla) {
        this.cebolla = cebolla;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Hamburguesa(String tamano, boolean cebolla) {

        switch(tamano) {
            case "Normal":
                this.tamano = tamano;
                int tamanoN = 1; 
                break;
            case "Doble":
                this.tamano = tamano;
                tamanoN = 2; 
                break;
            default:
                this.tamano = tamano;
                tamanoN = 1;
            }  
    }

    public void setTamano(String tamano) {
        this.tamano = tamano; 
    }

    String getTamano() {
        return this.tamano;
    }




        // tamano.equalsIgnoreCase(tamano);
        // if (tamano.equalsIgnoreCase("Normal"));{
        //     tamanoN = 1;
        //     break;
        // } else if (tamano.equalsIgnoreCase("Doble"));{
        //     tamanoN = 2; 
        //         break;}

    public void agregarAdicional(String adicional) {

        switch(adicional) {
            case "Tocineta":
                this.adicional = adicional;
                int adicionalN = 3000; 
                break;
            case "Jalapeños":
                this.adicional = adicional;
                adicionalN = 2000; 
                break;
        }
    }


    @Override
    public double calcularPrecio() {
    precioGeneral = (precioBase * tamanoN) + adicionalN;
    return precioGeneral;
    }
}