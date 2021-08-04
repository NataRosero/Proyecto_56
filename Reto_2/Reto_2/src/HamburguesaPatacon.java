public class HamburguesaPatacon implements Hamburguesa {
    int valorPatacon = 0;
    double precioBase = 5000;
    double precioGeneral = Hamburguesa.precioGeneral;
    // Atributos
 // Getters y setters de ser necesarios
 // Constructor sobrecargado
public HamburguesaPatacon(String tamano, boolean cebolla, String tipoPatacon) {
    int tamanoN;
    switch(tamano) {
        case "Normal":
            tamanoN = 1; 
            break;
        case "Doble":
            tamanoN = 2; 
            break;
    }   

    if (tipoPatacon == "Maduro"){
        valorPatacon = 4000;
    } else if (tipoPatacon == "Verde"){
        valorPatacon = 3000;
}
}
// Métodos
// Método calcularPrecio
public double calcularPrecio () {
double precioHamburguesa = 0;
precioHamburguesa = precioGeneral + valorPatacon;
return precioHamburguesa;
}
}
