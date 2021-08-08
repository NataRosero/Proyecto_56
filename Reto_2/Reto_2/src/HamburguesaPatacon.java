public class HamburguesaPatacon extends Hamburguesa {

    static final String TIPO_PATACON = "Maduro";

    protected String tipoPatacon;

    public HamburguesaPatacon(){

    }

//Constructor Sobrecargado
    public HamburguesaPatacon(String tamano, boolean cebolla, String tipoPatacon) {
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
        if (tipoPatacon != ""){
            this.tipoPatacon = tipoPatacon;
        } else {
            this.tipoPatacon= TIPO_PATACON;
        }
        this.precioBase = PRECIO_BASE;
        this.adicional = ADICIONAL;
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

    public String getTipoPatacon() {
        return tipoPatacon;
    }

    public void setTipoPatacon(String tipoPatacon) {
        this.tipoPatacon = tipoPatacon;
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
        double valorPatacon = 0;

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
        if (this.tipoPatacon.equalsIgnoreCase("Maduro")){
            valorPatacon = 4000;
        }
        if (this.tipoPatacon.equalsIgnoreCase("Verde")){
            valorPatacon = 3000;
        }
        precioGeneral = (this.precioBase * tamanoNum) + adicionalN;
        precioHamburguesa = precioGeneral + valorPatacon;
        return precioHamburguesa;
    }
}
