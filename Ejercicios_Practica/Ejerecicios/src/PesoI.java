import java.util.Scanner;
public class PesoI {
    public void PesoIdeal ( String nombre, String genero, int estatura){
        System.out.println("Calcular tu peso ideal");
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre? ");
        nombre = scan.nextLine();
        System.out.println("¿Cuál es tu género? Escribe F para Femenino y M para Masculino");
        genero = scan.nextLine();
        genero = genero.toUpperCase();
        System.out.println("¿Cuál es tu estatura? ");
        estatura = scan.nextInt();

        switch(genero) {
            case "F":
                System.out.println("Hola " + nombre + " Tu peso ideal es: " + (estatura - 120) + " Kg"); 
                break;
            case "M":
                System.out.println("Hola " + nombre + " tu peso ideal es: " + (estatura - 110) + " Kg"); 
                break;
            default :
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
