import java.util.Scanner;

public class SoloPuntos {
    public static void main(String[] args) {
/*
        Crear un programa SoloPuntos.java que dibuje n puntos. Donde n es un valor ingresado por el
        usuario al ejecutar el programa.
                Si por ejemplo n = 5, debe mostrar:
                *****
*/
        Scanner scInt = new Scanner(System.in);
        int userNumber;
        int i = 0;

        System.out.printf("Ingrese una cantidad de puntos: \n");
        userNumber = scInt.nextInt();

/*
        // With While loop
        while ( i < userNumber ) {
            System.out.printf("*");
            i++;
        }
*/

/*
        // With Do While loop
        do {
            System.out.printf("*");
            i++;
        } while ( i < userNumber );
*/

        // With For loop
        for (i = 0; i < userNumber; i++) {
            System.out.printf("*");
        }

    }
}
