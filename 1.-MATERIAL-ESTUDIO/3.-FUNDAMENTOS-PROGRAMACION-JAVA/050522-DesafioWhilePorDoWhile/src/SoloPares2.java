import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
/*
        PARTE 2:
        Ahora deberán crear el programa llamado SoloPares2.java, donde no se considere el cero.
        Si n = 4, la salida del programa deberá ser:
        2
        4
        6
        8
*/

        Scanner scINT = new Scanner(System.in);
        int userNumber;
        int i = 0;

        System.out.printf("Ingrese un numero para iterar y encontrar los pares: \n");
        userNumber = scINT.nextInt();

        while ( i < userNumber ) {
            i += 1;
            if ( i%2 == 0) {
                //System.out.printf("Numero par %d \n", i);
                System.out.print(i + "\n");
            }
        }
    }
}
