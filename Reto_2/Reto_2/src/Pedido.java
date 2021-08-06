public class Pedido  {
    // Atributos
   private double precioTotalHamburguesas;
   private double precioTotalHamburguesasNormal;
   private double precioTotalHamburguesasPatacon;
   private Hamburguesa listaHamburguesas[];
 //Constructores
   public Pedido() {
      precioTotalHamburguesas = 0;
      precioTotalHamburguesasNormal = 0;
      precioTotalHamburguesasPatacon = 0;
   }

 // Constructor sobrecargado

   public Pedido(Hamburguesa listaHamburguesas[]) {
   this.listaHamburguesas = listaHamburguesas;
   }


   public double getPrecioTotalHamburguesas() {
         return precioTotalHamburguesas;
      }

   public double getPrecioTotalHamburguesasNormal() {
         return precioTotalHamburguesasNormal;
      }


   public double getPrecioTotalHamburguesasPatacon() {
         return precioTotalHamburguesasPatacon;
      }

   // Método calcularTotales
   public void calcularTotales() {
      for (int ham = 0; ham < listaHamburguesas.length; ham++){
         if (listaHamburguesas [ham] instanceof Hamburguesa){
            precioTotalHamburguesas += listaHamburguesas[ham].calcularPrecio();
         }
         if (listaHamburguesas [ham] instanceof HamburguesaNormal){
            precioTotalHamburguesasNormal += listaHamburguesas[ham].calcularPrecio();
         }
         if (listaHamburguesas [ham] instanceof HamburguesaPatacon){
            precioTotalHamburguesasPatacon += listaHamburguesas[ham].calcularPrecio();
         }
      }
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
