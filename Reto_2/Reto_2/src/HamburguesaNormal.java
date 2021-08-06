public class HamburguesaNormal extends Hamburguesa {
    static final double PRECIO_BASE = 5000;
    static final String TAMANO = "Normal";
    static final boolean CEBOLLA = false;
    static final String TIPO_CARNE = "Res";
    protected String tamano;
    protected Boolean cebolla;
    protected double precioBase;
    protected String adicional;
    protected String tipoCarne;

    public HamburguesaNormal(){

    }

//Constructor Sobrecargado
    public HamburguesaNormal(String tamano, boolean cebolla, String tipoCarne) {
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
        if (tipoCarne != ""){
            this.tipoCarne = tipoCarne;
        } else {
            this.tipoCarne= TIPO_CARNE;
        }
        this.precioBase = PRECIO_BASE;
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

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public void agregarAdicional(String adicional) {
        this.adicional = adicional;
    }

// Métodos
// Método calcularPrecio
public double calcularPrecio() {
    double precioHamburguesa = 0;
    double precioGeneral = 0;
    int tamanoNum = 0;
    double adicionalN = 0;
    double valorCarne = 0;
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
    if (this.tipoCarne.equalsIgnoreCase("Res")){
        valorCarne = 4000;
    }
    if (this.tipoCarne.equalsIgnoreCase("Res apanado")){
        valorCarne = 6000;
    }
    if (this.tipoCarne.equalsIgnoreCase("Pollo apanado")){
        valorCarne = 7000;
    }

    precioHamburguesa = precioGeneral + valorCarne;
    return precioHamburguesa;
    }
}
