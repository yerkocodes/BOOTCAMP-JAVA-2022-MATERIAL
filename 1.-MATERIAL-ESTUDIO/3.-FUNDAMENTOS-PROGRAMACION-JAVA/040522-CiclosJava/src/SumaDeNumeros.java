import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
/*
        Crear el programa Suma.java, donde el usuario ingresa un número, se muestra la suma de
        todos los números de 1 hasta ese número.

            Ejemplo: si n = 100, el resultado es 5050.
*/

        Scanner scINT = new Scanner(System.in);
        int i = 0;
        int userNumber;

        //Leemos el valor ingresado por el usuario.
        System.out.print("Ingrese un numero a iterar \n");
        userNumber = scINT.nextInt();

        while ( i < userNumber ) {
            i += 1;
            System.out.printf("numero %d \n", i);
        }
    }
}