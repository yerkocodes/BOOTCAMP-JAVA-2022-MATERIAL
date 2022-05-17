import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        double r1;
        double r2;
        double r3;
        double resistenciaTotal;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese resistencia 1: ");
            r1 = sc.nextDouble();
        } while ( r1 <= 0 );

        do {
            System.out.println("Ingrese resistencia 2: ");
            r2 = sc.nextDouble();
        } while ( r2 <= 0 );

        do {
            System.out.println("Ingrese resistencia 3: ");
            r3 = sc.nextDouble();
        } while ( r3 <= 0 );

        resistenciaTotal = ( 1 / ((1/r1) + (1/r2) + (1/r3)) );

        System.out.println("La resistencia total es de " + resistenciaTotal);

    }
}
