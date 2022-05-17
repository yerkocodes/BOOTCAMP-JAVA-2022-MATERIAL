import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {
/*
        La secuencia de Fibonacci se caracteriza donde el siguiente número de la secuencia es la
        suma de los dos anteriores.
        0, 1, 1, 2 , 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        Donde:
            ● F(0) = 0
            ● F(1) = 1
            ● F(2) = 1
            ● F(3) = 2
            ● F(4) = 3
            ● F(n) = F(n-1) + F (n-2)
*/
/*
        Se debe crear un programa que reciba un número ingresado por el usuario, que indique
        cuántos elementos de la serie de Fibonacci se deben mostrar, y el programa debe mostrar
        los primeros n números de la secuencia de Fibonacci.
                Si se ingresa n = 7, se debe mostrar el siguiente resultado:
        0
        1
        1
        2
        3
        5
        8
        13
*/
        Scanner scInt = new Scanner(System.in);
        int userNumber;
        int i = 0;
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.printf("Ingrese un numero para comenzar la secuencia Fibonacci: \n");
        userNumber = scInt.nextInt();

        while( i <= userNumber ) {
            System.out.print(num1 + "\n"); // Imprime la variable actual de 1 ej: 0
            sum = num1 + num2; // El valor de sum se actualiza a la suma de num1 y num2 ej: 0 + 1
            num1 = num2; // El valor de num1 se actualiza al valor de num2 ej: pasa de 0 a 1
            num2 = sum; // El valor de num2 se actualiza a la suma de num1 y num2 ej: 0 + 1 = 1
            i++; // Nuestro contador i aumenta en 1 su valor para la iteración.
        }
    }
}
