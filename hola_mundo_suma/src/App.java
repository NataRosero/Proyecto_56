import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        sc.close();
        Scanner scan = new Scanner (System.in);
        System.out.println("¿Cuál es el número? ");
        int numero = Integer.parseInt(scan.nextLine());
        if(numero > 0){
            System.out.println("Es Mayor a 0");
        } else {
                System.out.println("No es Mayor a 0"); 

            }
        scan.close();
            switch(numero) {
                case 1:
                    System.out.println("Eligió 1"); 
                    break;
                case 2:
                    System.out.println("Eligió 2"); 
                    break;
                case 3:
                    System.out.println("Eligió 3"); 
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        for (int i = 0; i < 10; i += 2){
            System.out.println(i);
        }
        int num = 0;
        while (num < 10) {
            System.out.println(num);
            num += 2;
            if (num == 4); {
                break;
            }
        }

        int nume = 10;
        do{
            System.out.println(nume);
        nume --;
        } while (nume >= 0);

//Crear arreglos
int valores [];
valores = new int[3];
//Asignar valores
valores[0] = 56;
valores[0] = 98;
valores[0] = 46;

//Recorrer arreglo
for (int i = 0; i < valores.length; i++){
    System.out.println(valores[i]);
}




        /*String saludo = "Hola";
        char letra = 'a';
        saludo.length(); //cantidad de letras, hay mas opciones despues de la variable y el punto (saludo. ctrl + espacio) da control y espacio, aparecen mas opciones
        saludo.toUpperCase(); //mayuscula
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo  + ' ' + letra);*/
    }
}

// comentarios ojo siempre finaliza con ; 
/* para bloque */
/**
* Este es un comentario de documentacion.
* Se usa para el Javadoc de nuestro proyecto
*/ 
/**
 * siempre debes declarar las variables
int i=1;
import java.awt.*;
System.out.println("El primer programa");
rect.mover(10, 20);
*/ 

Suma suma = new Suma;{

}