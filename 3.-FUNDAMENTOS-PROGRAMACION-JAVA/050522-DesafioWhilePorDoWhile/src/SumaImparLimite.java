import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
/*
        PARTE 2:
        Crear programa SumaImparLimite.java, donde el usuario ingresa dos
        valores, el límite inferior (min) y superior(max) del intervalo para realizar la suma de
        los impares.
        Si min = 6 y max = 30 , la salida del programa deberá ser:
        216
        Que corresponde a sumar 7+9+11+13+15+17+19+21+23+25+27+29.
*/

        Scanner scINT = new Scanner(System.in);
        int userMinNumber;
        int userMaxNumber;
        int i;
        int total = 0;

        System.out.printf("Ingrese el numero minimo del rango a iterar: \n");
        userMinNumber = scINT.nextInt();
        i = userMinNumber;

        System.out.printf("Ingrese el numero maximo del rango a iterar: \n");
        userMaxNumber = scINT.nextInt();

        while ( i < userMaxNumber ) {
            i += 1;
            if ( i%2 != 0) {
                total += i;
                //System.out.print(i + "\n");
            }
        }
        System.out.print(total);
    }
}
