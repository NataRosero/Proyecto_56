import java.util.Scanner;
public class NotasEstudiante {
    public static void main (String [] arg) throws Exception {

    }
    public void Promedio(String name, float notaUno, float notaDos, float notatres) {
        Scanner sca = new Scanner (System.in);
        System.out.println("\nNotas estudiantes\n");
        System.out.print("Escribe el nombre del alumno: \n");
        name = sca.next();
        sca.nextLine();
        System.out.println("Escribe la primera nota: ");
        notaUno = sca.nextFloat();
        System.out.println("Escribe la segunda nota: ");
        notaDos = sca.nextFloat();
        System.out.println("Escribe la segunda nota: ");
        notatres = sca.nextFloat();
        float notaf = ((notaUno + notaDos + notatres) / 3);
        if (notaf >= 3){
            System.out.println("El estudiante " + name + " aprobó la asignatura con " + notaf);
        }else{
            System.out.println("El estudiante " + name + " no aprobó la asignatura, debe mejorar su rendimiento académico");
        };

    }
    
}
