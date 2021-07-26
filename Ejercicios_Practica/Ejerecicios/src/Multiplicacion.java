import java.util.Scanner;
public class Multiplicacion {
    public static void main (String [] arg) throws Exception {

    }
    public void multiplicar (int nume){
        Scanner num = new Scanner (System.in); 
        System.out.println("\nTabla de multiplicar\n");
        System.out.println("Escribe un número: ");
        int operador = num.nextInt();

        int numero = 0;
        System.out.println("\nTabla del " + operador + "\n");
        for (numero = 0 ; numero < 11; numero += 1){
            System.out.println(operador + " * " + numero + " = " + operador * numero);
        num.close();
        }
    }
}