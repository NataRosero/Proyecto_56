import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    System.out.println("\nOperador de números \n----------------------\n");

    Scanner scNumero = new Scanner (System.in);
    System.out.println("Escribe el primer número: ");
    int numeroUno = scNumero.nextInt();
    System.out.println("Escribe el segundo número: ");
    int numeroDos = scNumero.nextInt();
    scNumero.close();



    Operaciones Resultado = new Operaciones();
    Resultado.Resultado(numeroUno, numeroDos);{
        int suma = numeroUno + numeroDos;
        int resta = numeroUno - numeroDos;
        int division = numeroUno / numeroDos;
        int multiplicacion = numeroUno * numeroDos;
        System.out.println("\nLa suma entre " + numeroUno + " y "  + numeroDos  + " es igual a " + suma
                                + "\nLa resta entre " + numeroUno + " y "  + numeroDos  + " es igual a " + resta 
                                + "\nLa división entre " + numeroUno + " y "  + numeroDos  + " es igual a " + division
                                + "\nLa multiplicación entre " + numeroUno + " y "  + numeroDos  + " es igual a " + multiplicacion);
    };
}
}

