import java.util.Scanner;

public class AsteriscosYPuntos {
    public static void main(String[] args) {
/*
        Crear el programa AsteriscosYPuntos.java que dibuje asteriscos y puntos intercalados,
        hasta n. Donde n es un valor ingresado por el usuario. Por ejemplo, si el usuario ingresa:
        ● 3
        *.*
        ● 4
        *.*.
        ● 5
        *.*.*
*/
        Scanner scInt = new Scanner(System.in);
        int userNumber;

        System.out.print("Ingrese un numero para iterar asteriscos y puntos: \n");
        userNumber = scInt.nextInt();

        for ( int i = 1; i <= userNumber; i++ ) {
            if ( i%2 == 0 ) { // es par
                System.out.print(".");
            } else {
                System.out.print("*");
            }
        }

    }
}
