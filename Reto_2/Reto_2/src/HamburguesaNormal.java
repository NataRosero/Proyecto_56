public class HamburguesaNormal implements Hamburguesa {
    int valorCarne = 0;
    double precioBase = 5000;

public HamburguesaNormal(String tamano, boolean cebolla, String tipoCarne) {
    int tamanoN;
    switch(tamano) {
        case "Normal":
            tamanoN = 1; 
            break;
        case "Doble":
            tamanoN = 2; 
            break;
    }   

    if (tipoCarne == "Res"){
        valorCarne = 4000;
    } else if (tipoCarne == "Res apanado"){
        valorCarne = 6000;
    } else if (tipoCarne == "Pollo apanado"){
        valorCarne = 7000;
    }
}

// Métodos
// Método calcularPrecio
public double calcularPrecio () {
double precioHamburguesa = 0;
precioHamburguesa = Hamburguesa.precioGeneral + valorCarne;
return precioHamburguesa;
}
}
