import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
/*
        PARTE 1:
        Crea programa SumaImpar.java donde se sumen todos los valores impares
        desde 0 hasta n, donde n es ingresado por el usuario.
        Si n = 6, la salida del programa deberá ser:
        9
        Que corresponde a sumar 1+3+5.
*/

        Scanner scINT = new Scanner(System.in);
        int userNumber;
        int i = 0;
        int total = 0;

        System.out.printf("Ingrese un numero para iterar y sumar los impares: \n");
        userNumber = scINT.nextInt();

        while ( i < userNumber ) {
            i += 1;
            if ( i%2 != 0) {
                total += i;
            }
        }
        System.out.print(total);

    }
}
