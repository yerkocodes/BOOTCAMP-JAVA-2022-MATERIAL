import java.util.Scanner;

public class EjercicioMenu {
    public static void main(String[] args) {
/*
        Podemos implementar de forma sencilla un menú de opciones para el usuario. La lógica es
        similar a la de la validación de entrada.
            ● Se muestra un texto con opciones.
            ● El usuario tiene que ingresar una opción válida -> validación de entrada.
            ● Si el usuario ingresa la opción 1, mostramos un texto.
            ● Si el usuario ingresa la opción 2, mostramos otro texto.
            ● Si el usuario ingresa la opción "salir" terminamos el programa.
*/
        Scanner sc = new Scanner(System.in);
        String option = "";

        while ( !option.equals("salir") ) {
            System.out.printf("Escoge una opción: \n");
            System.out.printf("1 -- Acción 1\n");
            System.out.printf("2 -- Acción 2\n");
            System.out.printf("Escribe 'salir' para finalizar el programa \n");
            System.out.printf("Ingrese una opción: ");

            option = sc.nextLine();

            if ( option.equals("1") ) {
                System.out.printf("Realizando acción 1 \n");
            } else if ( option.equals("2") ) {
                System.out.printf("Realizando acción 2 \n");
            } else if ( option.equals("salir") ) {
                System.out.printf("Saliendo... \n");
            } else {
                System.out.printf("Opción inválida. \n");
            }
        }
    }
}
