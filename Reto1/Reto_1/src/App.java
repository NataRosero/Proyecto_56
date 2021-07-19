public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Comparar interés");
        System.out.println();

        Inversion inversionUno = new Inversion();
        System.out.println(inversionUno.compararInversion(12, 2000000, 3));

        System.out.println();

        Inversion inversionDos = new Inversion();
        System.out.println(inversionDos.compararInversion(24, 4500000, 7.9));
    }
}
