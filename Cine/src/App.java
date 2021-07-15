import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos al cine Lista de clientes");
        System.out.println();


        // Cliente Uno

        Cliente clienteUno = new Cliente();

        //Escribir por consola
        Scanner scan1 = new Scanner(System.in);
        System.out.println("¿Cuál es tu número de cédula? ");
        String cedula = scan1.nextLine();
        System.out.println("¿Cuál es tu nombre? ");
        String nombre = scan1.nextLine();

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

        //Pruebas con listas

        Listas listas = new Listas();
        listas.crearLista();


        /* int opcion = 0;
        while (opcion == 0){
            System.out.println("¿Cuál es tu número de cédula? ");
            cedula = scan1.nextLine();
            System.out.println("¿Cuál es tu nombre? ");
            nombre = scan1.nextLine();
            System.out.println("¿Cuál es tu ID? ");
            int id = scan1.nextInt();

            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setId(id);
            
            listas.agregarCliente(nuevoCliente);

            System.out.println("¿Desea agregar otro cliente? (0 continuar, 1 para salir )");
            opcion = scan1.nextInt();
            System.out.println();

        }
        */

        String opcion = "S";
        while (opcion.equalsIgnoreCase("S")){ //No import si es minuscula o mayuscula
            System.out.println("¿Cuál es tu número de cédula? ");
            cedula = scan1.next(); //Uso del next, solo lee la linea y se queda ahi 
            scan1.nextLine();//solo es el salto de line de escritura
            System.out.println("¿Cuál es tu nombre? ");
            nombre = scan1.nextLine();
            System.out.println("¿Cuál es tu ID? ");
            int id = scan1.nextInt();

            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setCedula(cedula);
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setId(id);
            
            listas.agregarCliente(nuevoCliente);

            System.out.println("¿Desea agregar otro cliente? (S continuar, N para salir )");
            opcion = scan1.next();
            System.out.println();

        }
        //listas.mostrarClientes();
        listas.mostrarDatosclientes();

    }

}
