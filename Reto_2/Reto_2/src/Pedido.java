public class Pedido  {
    // Atributos
    private double precioTotalHamburguesas;
    private double precioTotalHamburguesasNormal;
    private double precioTotalHamburguesasPatacon;
    private Hamburguesa listaHamburguesas[];
 //Constructores
    public Pedido() {
    }
 // Constructor sobrecargado

    public Pedido(Hamburguesa listaHamburguesas[]) {
    this.precioTotalHamburguesas = precioTotalHamburguesas;
    this.precioTotalHamburguesasNormal = precioTotalHamburguesasNormal;
    this.precioTotalHamburguesasPatacon = precioTotalHamburguesasPatacon;
    }

 // Método calcularTotales
    public void calcularTotales() {
        precioTotalHamburguesas = calcularPrecio;
        precioTotalHamburguesasNormal = HamburguesaNormal.calcularPrecio;
        precioTotalHamburguesasPatacon = HamburguesaPatacon.calcularPrecio;
    }
 // Método mostrarTotales
    public String mostrarTotales() {
    calcularTotales();
    String cadenaTotales = "El precio total de las hamburguesas es de " + precioTotalHamburguesas
    + "\nLa suma del precio de las hamburguesas normales es de " + precioTotalHamburguesasNormal
    + "\nLa suma del precio de las hamburguesas patacón es de " + precioTotalHamburguesasPatacon;
    return cadenaTotales;
    }
}
