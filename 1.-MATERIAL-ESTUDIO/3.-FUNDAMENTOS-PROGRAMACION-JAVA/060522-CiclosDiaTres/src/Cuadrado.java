import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
/*
        Si el usuario ingresa por ejemplo el 5, se dibujará un cuadrado de 5*5, donde cada elemento es
        un asterisco:
                *****
                *****
                *****
                *****
                *****
*/
        Scanner scInt = new Scanner(System.in);
        int userNumber;

        System.out.printf("Ingrese el numero para formar el cuadrado: \n");
        userNumber = scInt.nextInt();

        for ( int i = 1; i <= userNumber; i++ ) {
            for ( int j = 1; j <= userNumber; j++ ) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
