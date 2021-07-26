import java.util.Scanner;
public class Operaciones {
    public static void main (String [] arg) throws Exception {
    }

    public void Resultado(int numeroUno, int numeroDos) {
        System.out.println("\nOperador de números \n----------------------");

    Scanner sc = new Scanner (System.in);
    System.out.println("Escribe el primer número: ");
    numeroUno = sc.nextInt();
    System.out.println("Escribe el segundo número: ");
    numeroDos = sc.nextInt();
        int suma = numeroUno + numeroDos;
        int resta = numeroUno - numeroDos;
        float division = numeroUno / numeroDos;
        int multiplicacion = numeroUno * numeroDos;
        System.out.println("\nSuma: " + numeroUno + " + "  + numeroDos  + " = " + suma
                                + "\nResta: " + numeroUno + " - "  + numeroDos  + " = " + resta 
                                + "\nDivisión: " + numeroUno + " / "  + numeroDos  + " = " + division
                                + "\nMultiplicación: " + numeroUno + " * "  + numeroDos  + " = " + multiplicacion);
    sc.close();
                            };


    public void Sueldo (String nombre, int numeroHoras){
        Scanner sueldo = new Scanner (System.in); 
        System.out.println("Escribe el nombre del colaborador: ");
        nombre = sueldo.nextLine();
        System.out.println("Escribe el tiempo trabajado en horas "); 
        numeroHoras = sueldo.nextInt();
            int salario = numeroHoras * 30000;

        System.out.println("Al colaborador " + nombre + " se le debe pagar: $" + salario);
    }

}




