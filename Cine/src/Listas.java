import java.util.ArrayList;
import java.util.Scanner;

public class Listas {

    private ArrayList <Cliente> listaClientes; // en estes caso se inicializa aqui porque no se puede crear dentro del constructor ya que se crearía una lista nueva cada vez que se crea un cliente

    public Listas(){
        listaClientes = new ArrayList<>();
    }

    public void crearLista() {
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        Scanner scan2 = new Scanner(System.in);
        int numero = 0;
        while (numero >= 0){
            System.out.println("¿Cuál es tu número de cédula? (Ingresa un número negativo para salir) ");
            numero = scan2.nextInt();
            if (numero >= 0) {
                listaNumeros.add(numero);
            scan2.close();
            }
        }

        System.out.println();

        for (int i = 0; i < listaNumeros.size();i++){
            System.out.println(listaNumeros.get(i));
        }

        System.out.println();

        // for each
        listaNumeros.forEach((elemento) -> {
            System.out.println(elemento);
        });
    }


        public void agregarCliente(Cliente pCliente){
            listaClientes.add(pCliente);
        }

    public void mostrarClientes() {
        for (int i = 0; i < listaClientes.size();++i){
            System.out.println(listaClientes.get(i).getNombre() + listaClientes.get(i).getCedula() );
        }
    }

    public void mostrarDatosclientes(){
        String cadenaClientes = "";
        System.out.println("\nDatos de los clientes");
        for (int i = 0; i < listaClientes.size(); i++){
            String datos = "\nEl cliente: " + listaClientes.get(i).getNombre()
                            + ", con número de cédula: " + listaClientes.get(i).getCedula()
                            + " y ID número: " + listaClientes.get(i).getId()
                            + "\n---------------------------------------------------";
            cadenaClientes = cadenaClientes.concat(datos); //le concatena una nueva cadena de datos con cada iteración
        
        }
        System.out.println(cadenaClientes);
    
    }

}
