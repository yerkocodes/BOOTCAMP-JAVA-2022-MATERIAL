package cl.yerko.utilities;

import java.util.Scanner;

public class Utilidad {
    public void tiempoEspera() {
        //CODE HERE
    }

    public void limpiarPantalla() {
        //CODE HERE
    }

    //Sobrecarga de metodo message
    public static void message(String msj) {
        //CODE HERE
            System.out.println(msj);
    }

    public static void message() {
        //CODE HERE
        System.out.println();
    }

    public static String validateArgumentNotNull(Scanner scanner) {
        String input;
        do {
            input = scanner.nextLine();
            if ( input.isEmpty() ) {
                Utilidad.message("Ingrese dato");
            }
        } while ( input.isEmpty() );
        return input;
    }
}
