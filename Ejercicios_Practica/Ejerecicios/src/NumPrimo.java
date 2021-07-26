import java.util.Scanner;
public class NumPrimo{
  
    public boolean esPrimo;
    
    public void nPrimos( int numero){
        System.out.println("Numeros primos");
        Scanner num = new Scanner (System.in);
        System.out.println("Escribe un número: ");
        numero = num.nextInt();
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
        esPrimo = false;
        }
        for (int x = 2; x < numero / 2; x++) {
        if (numero % x == 0)
        esPrimo = false;
        } 

          if (esPrimo = false){
            System.out.println("El número " + numero + " no es primo");
          } else {
            System.out.println("El número " + numero + " es primo");
          }
  }
}
        
