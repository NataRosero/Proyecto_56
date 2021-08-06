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

//Constructor Sobrecargado
    public Hamburguesa(String tamano, boolean cebolla) {
        if (tamano != ""){
            this.tamano = tamano;
        } else {
            this.tamano = TAMANO;
        }
        if (cebolla = true){
            this.cebolla = cebolla;
        } else {
            this.cebolla = CEBOLLA;
        }
        this.precioBase = PRECIO_BASE;
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

    public void agregarAdicional(String adicional) {
        this.adicional = adicional;
    }

    public double calcularPrecio() {
        double precioGeneral = 0;
        int tamanoNum = 0;
        double adicionalN = 0; 

        if (this.adicional.equalsIgnoreCase("Tocineta")){
            adicionalN = 3000;
        }
        if (this.adicional.equalsIgnoreCase("Jalapeños")){
            adicionalN = 2000;
        }
        if (this.tamano.equalsIgnoreCase("Normal")){
            tamanoNum = 1;
        }
        if (this.tamano.equalsIgnoreCase("Doble")){
            tamanoNum = 2;
        }

        precioGeneral = (this.precioBase * tamanoNum) + adicionalN;
        return precioGeneral;
        }
}
