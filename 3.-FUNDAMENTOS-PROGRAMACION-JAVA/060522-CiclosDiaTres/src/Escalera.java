import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {
/*
        ● Si el usuario ingresa 5, se dibujan 5 filas.
        ● En la fila 1, hay 1 asterisco.
        ● En la fila 2, hay 2 asteriscos.
        ● Por lo que podemos decir que en la fila n hay n asteriscos.
*/
        Scanner scInt = new Scanner(System.in);
        int userNumber;

        System.out.printf("Ingrese el numero para comenzar la escalera: \n");
        userNumber = scInt.nextInt();

        String acumulador = "*";

/*
        // Con un ciclo for y un operador de asignacion aditiva
        for ( int i = 1; i <= userNumber; i++ ) {
            System.out.print(acumulador);
            acumulador += "*";
            System.out.printf("\n");
        }
*/

        // Con ciclo for anidado
        for ( int i = 0; i < userNumber; i++ ) {
            for ( int j = 0; j <= i; j++ ) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
