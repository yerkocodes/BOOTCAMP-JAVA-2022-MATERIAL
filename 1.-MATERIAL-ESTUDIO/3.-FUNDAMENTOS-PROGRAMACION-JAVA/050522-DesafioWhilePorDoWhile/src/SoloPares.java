import java.util.Arrays;
import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
/*
        PARTE 1:
        Deberán crear un programa llamado SoloPares.java, el cuál deberá recibir un
        parámetro n ingresado por el usuario y mostrar los primeros n pares.
        Si n = 4, la salida del programa deberá ser:
        0
        2
        4
        6
*/
        Scanner scINT = new Scanner(System.in);
        int userNumber;
        int i = 0;

        System.out.printf("Ingrese un numero para iterar y encontrar los pares: \n");
        userNumber = scINT.nextInt();

        while ( i < userNumber ) {
            if ( i%2 == 0) {
                //System.out.printf("Numero par %d \n", i);
                System.out.print(i + "\n");
            }
            i += 1;
        }

    }
}
