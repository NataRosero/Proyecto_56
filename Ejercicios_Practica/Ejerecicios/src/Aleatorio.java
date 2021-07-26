import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public void Aleatorios () {
        Random aleator = new Random();
        Scanner adiv = new Scanner(System.in);
        int num = 0;
        int numero = 0;
        System.out.println("Adivina un número entre 1 y 10");
        num = (aleator.nextInt(11));
        while (numero != num){
            System.out.println("Escribe un numero: ");
            numero = adiv.nextInt();
            //System.out.println(num); //para saber cual es el número
            System.out.println();
        } 
        if (numero == num){
            System.out.println("¡¡Adivinastes el número!!");
        } else {
            System.out.println("No adivinaste e número :(");
        }
        //System.out.println("¡Adivinaste el número!");
        
    }
}
