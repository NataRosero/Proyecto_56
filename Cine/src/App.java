import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos al cine");
        System.out.println();

        // Cliente Uno

        Cliente clienteUno = new Cliente();

        //Escribir por consola
        Scanner scan1 = new Scanner(System.in);
        System.out.println("¿Cuál es tu número de cédula? ");
        String cedula = scan1.nextLine();
        System.out.println("¿Cuál es tu nombre? ");
        String nombre = scan1.nextLine();
        scan.close();

        clienteUno.setCedula(cedula);
        clienteUno.setNombre(nombre);
        clienteUno.setId(1);
        float precio = clienteUno.calcularPrecio(8000);
        System.out.println("Cédula: " + clienteUno.getCedula()
                            + "\nNombre: " + clienteUno.getNombre()
                            + "\nID: " + clienteUno.getId()
                            + "\nPrecio entrada: " + precio);
        clienteUno.saludar(); //Opción 1 de saludar
        clienteUno.mostrarDatos();
        

        // Cliente Dos

        ClientePremium clienteDos = new ClientePremium();

        clienteDos.setCedula("1165871");
        clienteDos.setNombre("José");
        clienteDos.setNumeroTarjeta(100);
        float precioDos = clienteDos.calcularPrecio(8000);

        System.out.println();

        System.out.println("Cédula: " + clienteDos.getCedula()
                            + "\nNombre: " + clienteDos.getNombre()
                            + "\nNúmero tarjeta: " + clienteDos.getNumeroTarjeta()
                            + "\nPrecio entrada: " + precioDos);
        clienteDos.saludar("Buenos días "); //Opción 2 de saludar
        clienteDos.mostrarDatos();
    }

}
