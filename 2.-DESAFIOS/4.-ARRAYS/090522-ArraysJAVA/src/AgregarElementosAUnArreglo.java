import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AgregarElementosAUnArreglo {
    public static void main(String[] args) {
/*
        Dado un arreglo llamado “ingredientes” se nos pide crear un programa donde el usuario
        pueda consultar si un ingrediente existe en la pizza, y si no existe debe ser añadido a la lista
        de ingredientes.
        ingredientes // [piña, jamón, salsa, queso]
*/

//        Crear un ArrayList de tipo String llamado “ingredientes” el cual se le agrega
//        los valores por defectos citados en el ejercicio.
//
//      

        Scanner scString = new Scanner(System.in);
        String toSearch;
        String optionToAdd;

        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("pina");
        ingredientes.add("jamon");
        ingredientes.add("salsa");
        ingredientes.add("queso");

        System.out.println("Ingrese un ingrediente a buscar en la lista: \n");
        toSearch = scString.nextLine();

        if ( ingredientes.contains(toSearch) ) {
            System.out.printf("El ingrediente %s se encuentra dentro de la pizza. \n", toSearch);
        } else {
            System.out.printf("El ingrediente %s no se encuentra en la lista, desea agregarlo? S/N :\n", toSearch);
            optionToAdd = scString.nextLine();

            if (Objects.equals(optionToAdd, "S") || Objects.equals(optionToAdd, "s")) {
                ingredientes.add(toSearch);
                System.out.printf("El ingrediente %s fue agregado con exito. \n", toSearch);
            } else if (Objects.equals(optionToAdd, "N") || Objects.equals(optionToAdd, "n")) {
                System.out.print("Ingrediente no agregado. \n");
            }
        }

    }
}
